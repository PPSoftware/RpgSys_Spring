package io.github.ppsoftware.rpgSys.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import io.github.ppsoftware.rpgSys.model.UserDao;
import io.github.ppsoftware.rpgSys.service.UserService;

@Component
public class UserValidator implements Validator {
    
	@Autowired
    private UserService userService;

    public boolean supports(Class<?> aClass) {
        return UserDao.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        UserDao user = (UserDao) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "NotEmpty");
        if (user.getUserName().length() < 6 || user.getUserName().length() > 32) {
            errors.rejectValue("userName", "Size.userForm.username");
        }
        if (userService.findByUsername(user.getUserName()) != null) {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }

        if (!user.getPasswordConfirm().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }
    }
}
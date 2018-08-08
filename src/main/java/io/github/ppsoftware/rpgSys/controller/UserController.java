package io.github.ppsoftware.rpgSys.controller;



import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import io.github.ppsoftware.rpgSys.data.IUserDaoRepository;
import io.github.ppsoftware.rpgSys.model.LoginAuditDao;
import io.github.ppsoftware.rpgSys.model.UserDao;
import io.github.ppsoftware.rpgSys.service.ISecurityService;
import io.github.ppsoftware.rpgSys.service.UserService;
import io.github.ppsoftware.rpgSys.validator.UserValidator;

import org.springframework.validation.BindingResult;


@Controller
@RequestMapping("/user")
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private IUserDaoRepository repoUser;
	
		
	@RequestMapping(method=RequestMethod.GET, path = "/{id}")
	public Map<String,UserDao> find(@PathVariable BigInteger id) {
		
		logger.info("#### User Controller - find ####");
		
		Map<String,UserDao> mapa = new HashMap<String, UserDao>();
		
		if(repoUser.findById(id).isPresent()){
			mapa.put("OK", repoUser.findById(id).get());
		}else{
			mapa.put("ERRO - Usuário não encontrado", new UserDao());
		}
			
		return  mapa;
		
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public ResponseEntity<UserDao> save(@RequestBody UserDao user) {
		
		logger.info("#### User Controller - save ####");
		UserDao stored = null;
		// Retrieve from Repo
		if (user.getEmail() != null ) {		
			stored = repoUser.findByUserNameAndEmail(user.getUserName(),
				user.getEmail());
		}
		
			
		if (stored == null) {
			stored = new UserDao();

		}
		
		repoUser.save(stored);
		
		return ResponseEntity.status(HttpStatus.OK).build(); 
	}
	
	 @Autowired
	    private UserService userService;

	    @Autowired
	    private ISecurityService securityService;

	    @Autowired
	    private UserValidator userValidator;

	    @RequestMapping(value = "/registration", method = RequestMethod.GET)
	    public String registration(Model model) {
	        model.addAttribute("userForm", new UserDao());

	        return "registration";
	    }

	    @RequestMapping(value = "/registration", method = RequestMethod.POST)
	    public String registration(@ModelAttribute("userForm") UserDao userForm, BindingResult bindingResult, Model model) {
	        userValidator.validate(userForm, bindingResult);

	        if (bindingResult.hasErrors()) {
	            return "registration";
	        }

	        userService.save(userForm);

	        securityService.autologin(userForm.getUserName(), userForm.getPasswordConfirm());

	        return "redirect:/welcome";
	    }

	    @RequestMapping(value = "/login", method = RequestMethod.GET)
	    public String login(Model model, String error, String logout) {
	        if (error != null)
	            model.addAttribute("error", "Your username and password is invalid.");

	        if (logout != null)
	            model.addAttribute("message", "You have been logged out successfully.");

	        return "login";
	    }

	    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
	    public String welcome(Model model) {
	        return "welcome";
	    }
	}


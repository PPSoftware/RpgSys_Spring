package io.github.ppsoftware.rpgSys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.ppsoftware.rpgSys.data.IUserDaoRepository;
import io.github.ppsoftware.rpgSys.model.UserDao;
import io.github.ppsoftware.rpgSys.model.UserGroupDao;

import java.util.HashSet;
import java.util.Set;



@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    @Autowired
    private IUserDaoRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserDao user = userRepository.findByUserName(userName);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (UserGroupDao group : user.getGroups()){
            grantedAuthorities.add(new SimpleGrantedAuthority(group.getName()));
        }

        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), grantedAuthorities);
    }
}
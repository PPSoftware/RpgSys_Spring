package io.github.ppsoftware.rpgSys.service;

import org.springframework.stereotype.Component;

@Component
public interface ISecurityService {

	String findLoggedInUsername();

	void autologin(String username, String password);

}

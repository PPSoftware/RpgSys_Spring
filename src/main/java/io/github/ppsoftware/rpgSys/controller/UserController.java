package io.github.ppsoftware.rpgSys.controller;



import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.github.ppsoftware.rpgSys.data.IUserDaoRepository;
import io.github.ppsoftware.rpgSys.model.LoginAuditDao;
import io.github.ppsoftware.rpgSys.model.UserDao;

@RestController
@RequestMapping("/user")
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private IUserDaoRepository repoUser;
	
		
	@RequestMapping(method=RequestMethod.GET, path = "/{id}")
	public Map<String,UserDao> find(@PathVariable BigInteger id) {
		
		logger.info("#### User Controller - find ####");
		
		Map<String,UserDao> mapa = new HashMap<>();
		
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
			stored = repoUser.findByLoginAndEmail(user.getLogin(),
				user.getEmail());
		}
		
			
		if (stored == null) {
			stored = new UserDao();

		}
		
		repoUser.save(stored);
		
		return ResponseEntity.status(HttpStatus.OK).build(); 
	}
	
}

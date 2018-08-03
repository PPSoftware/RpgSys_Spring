package io.github.ppsoftware.rpgSys.data;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import io.github.ppsoftware.rpgSys.model.UserDao;
import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;

@Component
public interface IUserDaoRepository extends CrudRepository<UserDao, BigInteger>, JpaSpecificationExecutor<UserDao>  {

	UserDao findByLoginAndEmail(String login, String email);
		
	List<UserDao> findByLogin(String login);
	
}

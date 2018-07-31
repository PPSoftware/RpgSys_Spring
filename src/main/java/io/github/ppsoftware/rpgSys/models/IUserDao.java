package io.github.ppsoftware.rpgSys.models;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IUserDao<T> extends CrudRepository<UserDAO, T >{
	


}

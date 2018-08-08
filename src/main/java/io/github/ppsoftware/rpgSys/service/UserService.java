package io.github.ppsoftware.rpgSys.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import io.github.ppsoftware.rpgSys.data.IUserDaoRepository;
import io.github.ppsoftware.rpgSys.model.UserDao;

@Service
public class UserService implements IUserDaoRepository{

	public <S extends UserDao> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends UserDao> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<UserDao> findById(BigInteger id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existsById(BigInteger id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<UserDao> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<UserDao> findAllById(Iterable<BigInteger> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteById(BigInteger id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(UserDao entity) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends UserDao> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public Optional<UserDao> findOne(Specification<UserDao> spec) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserDao> findAll(Specification<UserDao> spec) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<UserDao> findAll(Specification<UserDao> spec, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserDao> findAll(Specification<UserDao> spec, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count(Specification<UserDao> spec) {
		// TODO Auto-generated method stub
		return 0;
	}

	public UserDao findByUserNameAndEmail(String userName, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDao findByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}


 
  
   }
 
   
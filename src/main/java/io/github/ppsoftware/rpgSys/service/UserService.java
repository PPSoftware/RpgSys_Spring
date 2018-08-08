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

	@Override
	public <S extends UserDao> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserDao> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<UserDao> findById(BigInteger id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(BigInteger id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<UserDao> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<UserDao> findAllById(Iterable<BigInteger> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(BigInteger id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserDao entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends UserDao> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<UserDao> findOne(Specification<UserDao> spec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDao> findAll(Specification<UserDao> spec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<UserDao> findAll(Specification<UserDao> spec, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDao> findAll(Specification<UserDao> spec, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count(Specification<UserDao> spec) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserDao findByUserNameAndEmail(String userName, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDao findByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDao> findByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}
 
  
   }
 
   
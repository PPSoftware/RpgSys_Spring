package io.github.ppsoftware.rpgSys.data;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import io.github.ppsoftware.rpgSys.model.UserDao;



public class UserSpecification {
	
	public static Specification<UserDao> isLogin(String login) {
		
		return new Specification<UserDao>() {
	

			@Override
			public Predicate toPredicate(Root<UserDao> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
				return builder.equal(root.get("login"), login);				
			}
		};
	}


	

}

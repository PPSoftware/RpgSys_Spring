package io.github.ppsoftware.rpgSys.models;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope( BeanDefinition.SCOPE_PROTOTYPE )
public class UserDAO< T extends Serializable >
  extends AbstractHibernateDao< T > implements IUserDao< T >{
   //
}
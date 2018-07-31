package io.github.ppsoftware.rpgSys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.ppsoftware.rpgSys.models.IUserDao;

@Service
class UserService implements IUserService{
 
   IUserDao< User > dao;
 
   @Autowired
   public void setDao( IUserDao< User > daoToSet ){
      dao = daoToSet;
      dao.setClazz( User.class );
   }
 
   // ...

}
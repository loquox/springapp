package com.loquox.springapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loquox.springapp.beans.User;
import com.loquox.springapp.daos.DaoUsuario;

@Service
public class UserService {
	
	@Autowired
	DaoUsuario userDao;
	
		
	public List<User> findAllUsers(){
		return userDao.findAllUsers();
	}
	
	

}

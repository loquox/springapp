package com.loquox.springapp.daos;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.loquox.springapp.beans.User;

@Repository
public class DaoUsuario {

	private  JdbcTemplate jdbcTemplate;
	
	@Autowired
	public DaoUsuario(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate=jdbcTemplate;
		
	}
	
	public List<User> findAllUsers() {
	    String query = "SELECT * FROM usuario";
	    return jdbcTemplate.query(query, (rs, rowNum) -> {
	        User user = new User();
	        user.setId(rs.getInt("id"));
	        user.setNombre(rs.getString("nombre"));
	        user.setCorreo(rs.getString("correo"));
	        user.setTelefono(rs.getString("telefono"));
	        return user;
	    });
	}
	
	
	

	}	
	



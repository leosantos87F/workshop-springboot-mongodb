package com.leosantos.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leosantos.workshopmongo.domain.User;
import com.leosantos.workshopmongo.repository.UserRepository;
import com.leosantos.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	 public User findById(String id) { 
	  Optional<User> obj = repo.findById(id); 
	  return obj.orElseThrow(() -> new ObjectNotFoundException("Object has been not found.")); 
	} 

}

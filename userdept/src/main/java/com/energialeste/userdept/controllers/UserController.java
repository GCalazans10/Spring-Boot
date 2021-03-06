package com.energialeste.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.energialeste.userdept.entities.User;
import com.energialeste.userdept.repositories.UserRepository;


@RestController
@RequestMapping (value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	//LISTA TODOS OS USUÁRIOS
	@GetMapping
	public List <User> findAll() {
		List<User> result = repository.findAll();
		return result;
	}
	//EXIBIRUM USUÁRIO
	@GetMapping( value = "/{id}")
	public User findByID(@PathVariable Long id) {
		User result = repository.findById(id).get();
		return result;
		
	}
	// SALVAR NOVO USUÁRIO
	@PostMapping 
	public User insert(@RequestBody User user) {
		User result = repository.save(user);
		return result;
		
	}

}

package com.barros.edson.workshopmongodb.services;
import com.barros.edson.workshopmongodb.domain.*;
import com.barros.edson.workshopmongodb.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//falar que é um servico
@Service

public class UserService {

	//importar diretamente
	@Autowired 
	private UserRepository repo;
	
	public List<User> findAll(){
		
		return repo.findAll();
		
	}
	
}

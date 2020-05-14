package com.barros.edson.workshopmongodb.resources;
//Importacao para utilizar o User nos List
import  com.barros.edson.workshopmongodb.domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//Para falar que isso vai ser um rest
@RestController
//caminho do endpoint
@RequestMapping(value="/users")

public class UserResource {
	//metodo de obter os dados
	@RequestMapping(method=RequestMethod.GET)
	
	/*
	 criacao da lista de usuarios e ResponseEntity é encapsular para retornar resposta hhtps com possiveis respostas 
	  */
	public ResponseEntity<List<User>> findAll(){
	User maria = new User("1", "Maria Brown", "maria@gmail.com");
	User alex = new User("2", "Alex Green", "alex@gmail.com");	
	//criando interface com array list para poder utilizar o list
	List<User> list = new ArrayList<>();
	//Adicionando na lista os valores das variaveis
	list.addAll(Arrays.asList(maria, alex));
	//returnlist
	return ResponseEntity.ok().body(list);
	}
	
}

package com.barros.edson.workshopmongodb.resources;
//Importacao para utilizar o User nos List
import  com.barros.edson.workshopmongodb.domain.User;
import com.barros.edson.workshopmongodb.services.UserService;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	
	/*
	 criacao da lista de usuarios e ResponseEntity é encapsular para retornar resposta hhtps com possiveis respostas 
	  */
	public ResponseEntity<List<User>> findAll(){
		
	//puxandos os valores do service.findall
	List<User> list = service.findAll();
	//returnlist
	return ResponseEntity.ok().body(list);
	}
	
}

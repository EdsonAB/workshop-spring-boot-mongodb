package com.barros.edson.workshopmongodb.config;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.barros.edson.workshopmongodb.domain.User;
import com.barros.edson.workshopmongodb.repository.UserRepository;

//Spring entender que é uma configuracao 
@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		// TODO Auto-generated method stub
		//Estamos utilizando null no id, pois o id vai ser gerado pelo banco de dados
		User maria = new User(null,"Maria Brown","maria@gmail.com");
		User alex = new User(null,"Alex Green","alex@gmail.com");
		User bob = new User(null,"Bob Grey","bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
	}

}

package com.barros.edson.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.barros.edson.workshopmongodb.domain.User;

@Repository
//uma interface que extends de uma classe do proprio spring para manter os dados do banco de dados
public interface UserRepository extends MongoRepository<User, String> {

}

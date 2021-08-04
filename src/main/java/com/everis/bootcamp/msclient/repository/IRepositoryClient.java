package com.everis.bootcamp.msclient.repository;

import com.everis.bootcamp.msclient.collections.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IRepositoryClient extends ReactiveMongoRepository<Client, String> {
}

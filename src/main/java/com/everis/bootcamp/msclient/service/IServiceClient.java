package com.everis.bootcamp.msclient.service;

import com.everis.bootcamp.msclient.collections.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServiceClient {

    Mono<Client> register(Client client);
    Mono<Client> update(Client client);
    Flux<Client> getAll();
    Mono<Client> findByIdClient(String id);
    Mono<Void> deleteByIdClient(String id);

}

package com.everis.bootcamp.msclient.serviceImpl;

import com.everis.bootcamp.msclient.collections.Client;
import com.everis.bootcamp.msclient.repository.IRepositoryClient;
import com.everis.bootcamp.msclient.service.IServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteServiceImpl implements IServiceClient {

    @Autowired
    private IRepositoryClient repositoryClient;

    @Override
    public Mono<Client> register(Client client) {
        return repositoryClient.save(client);
    }

    @Override
    public Mono<Client> update(Client client) {
        return repositoryClient.save(client);
    }

    @Override
    public Flux<Client> getAll() {
        return repositoryClient.findAll();
    }

    @Override
    public Mono<Client> findByIdClient(String id) {
        return repositoryClient.findById(id);
    }

    @Override
    public Mono<Void> deleteByIdClient(String id) {
       return repositoryClient.deleteById(id);
    }
}

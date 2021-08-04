package com.everis.bootcamp.msclient.controller;

import com.everis.bootcamp.msclient.collections.Client;
import com.everis.bootcamp.msclient.service.IServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private IServiceClient serviceClient;


    @GetMapping(name = "/list")
    private Flux<Client> listClients(){
         return serviceClient.getAll();
    }


}

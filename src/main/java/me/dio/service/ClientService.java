package me.dio.service;

import me.dio.domain.model.Client;

public interface ClientService {

    Client findByID (Long id);

    Client create(Client clientToCreate);
}

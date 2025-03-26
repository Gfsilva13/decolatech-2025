package me.dio.service.impl;

import me.dio.domain.model.Client;
import me.dio.domain.repository.ClientRepository;
import me.dio.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public Client findByID(Long id) {
        return clientRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Client create(Client clientToCreate) {
        if (clientRepository.existsByAccountNumber(clientToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("Número de Conta já está sendo usado.");
        }
        return clientRepository.save(clientToCreate);
    }
}

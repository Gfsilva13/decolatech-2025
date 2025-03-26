package me.dio.controller;

import me.dio.domain.model.Client;
import me.dio.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService =  clientService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> findByid(@PathVariable Long id){
        var client = clientService.findByID(id);
        return ResponseEntity.ok(client);
    }

    @PostMapping
    public ResponseEntity<Client> create (@RequestBody Client clientToCreate){
        var clientCreated = clientService.create(clientToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(clientCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(clientCreated);
    }
}

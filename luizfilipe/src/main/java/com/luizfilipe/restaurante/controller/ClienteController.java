package com.luizfilipe.restaurante.controller;

import com.luizfilipe.restaurante.model.Cliente;
import com.luizfilipe.restaurante.model.Mesa;
import com.luizfilipe.restaurante.respositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> getAllMesass(){
        return clienteRepository.findAll();
    }

    @PostMapping
    public Cliente criaCliente(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
}

package com.luizfilipe.restaurante.controller;

import com.luizfilipe.restaurante.model.Mesa;
import com.luizfilipe.restaurante.model.Pedido;
import com.luizfilipe.restaurante.respositories.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/mesa")
public class MesaController {

    @Autowired
    private MesaRepository mesaRepository;

    @GetMapping
    public List<Mesa> getAllMesass(){
        return mesaRepository.findAll();
    }

    @PostMapping
    public Mesa criaMesa(@RequestBody Mesa mesa){
        return mesaRepository.save(mesa);
    }
}

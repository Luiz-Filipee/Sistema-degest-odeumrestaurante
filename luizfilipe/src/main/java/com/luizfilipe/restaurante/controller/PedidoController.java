package com.luizfilipe.restaurante.controller;

import com.luizfilipe.restaurante.model.Pedido;
import com.luizfilipe.restaurante.respositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public List<Pedido> getAllPedidos(){
        return pedidoRepository.findAll();
    }

    @PostMapping
    public Pedido criaPedido(@RequestBody Pedido pedido){
        return pedidoRepository.save(pedido);
    }
}

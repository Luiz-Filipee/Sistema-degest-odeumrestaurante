package com.luizfilipe.restaurante.controller;

import com.luizfilipe.restaurante.model.MenuItem;
import com.luizfilipe.restaurante.respositories.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/menu")
public class MenuItemController {

    @Autowired
    private MenuItemRepository menuItemRepository;

    @GetMapping
    public List<MenuItem> getAllItems() {
        return menuItemRepository.findAll();
    }

    @PostMapping
    public MenuItem criaMenuItem(@RequestBody MenuItem data){
        return menuItemRepository.save(data);
    }
}

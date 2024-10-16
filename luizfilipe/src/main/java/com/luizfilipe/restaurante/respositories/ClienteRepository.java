package com.luizfilipe.restaurante.respositories;

import com.luizfilipe.restaurante.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

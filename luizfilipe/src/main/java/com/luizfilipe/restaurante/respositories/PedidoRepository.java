package com.luizfilipe.restaurante.respositories;

import com.luizfilipe.restaurante.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}

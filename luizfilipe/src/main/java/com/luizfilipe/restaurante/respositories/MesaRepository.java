package com.luizfilipe.restaurante.respositories;

import com.luizfilipe.restaurante.model.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesaRepository extends JpaRepository<Mesa, Long> {
}

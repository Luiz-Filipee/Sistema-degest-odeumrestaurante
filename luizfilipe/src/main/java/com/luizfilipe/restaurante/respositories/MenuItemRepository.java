package com.luizfilipe.restaurante.respositories;

import com.luizfilipe.restaurante.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}

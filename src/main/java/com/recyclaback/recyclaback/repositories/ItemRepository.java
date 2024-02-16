package com.recyclaback.recyclaback.repositories;

import com.recyclaback.recyclaback.entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}

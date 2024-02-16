package com.recyclaback.recyclaback.controllers;

import com.recyclaback.recyclaback.entities.Item;
import com.recyclaback.recyclaback.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class ItemsController {

    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    @ResponseBody
    private Iterable<Item> getAllItems() {
        Iterable<Item> items = itemRepository.findAll();
        return items;
    }

    @RequestMapping(path = "/item", method = RequestMethod.GET)
    @ResponseBody
    private Item getItemById(@RequestParam Long id) {
        Optional<Item> item = itemRepository.findById(id);
        if (item.isPresent()){
            return item.get();
        }
        return null;
    }

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}

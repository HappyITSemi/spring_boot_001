package com.example.spring_boot_001.service;

import com.example.spring_boot_001.model.Item;
import com.example.spring_boot_001.repository.ItemRepository;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;
    public List<Item> getAllItems(){
        List<Item> allItems = new ArrayList<>();
        itemRepository.findAll().forEach(allItems::add);
        return allItems;
//        List<Item> lst = Arrays.asList(
//                new Item(1L, "name-1", "category-1"),
//                new Item(2L, "name-2", "category-2")
//        );
//        return lst;
    }
}

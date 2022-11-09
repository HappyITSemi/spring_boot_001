package com.example.spring_boot_001.controller;

import com.example.spring_boot_001.service.ItemService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    private ItemService itemService;

}

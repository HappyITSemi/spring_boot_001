package com.example.spring_boot_001.controller;

import com.example.spring_boot_001.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloRestController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/api/hello")
    public String apiHello(@RequestParam("name") String name, @RequestParam("age") int age){
        return "Hello-" + name + age;
    }

    @GetMapping("/api/hello2/{name}/{age}")
    public String apiHello2(@PathVariable("name") String name, @PathVariable("age") int age){
        return "Hello2---" + name + age;
    }

    @GetMapping("/api/items")
    public List apiItems(){
        List lst = itemService.getAllItems();
        return lst;
    }
}

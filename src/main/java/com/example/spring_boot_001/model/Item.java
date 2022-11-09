package com.example.spring_boot_001.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "items", schema = "public")
public class Item {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(length=120) private String name;
    @Column(length=120) private String category;
    @Column private Boolean published;
    public Item(Long id, String name, String category, Boolean published){
        this.id = id;
        this.name = name;
        this.category = category;
        this.published = published;
    }

    public Item() {
    }
}

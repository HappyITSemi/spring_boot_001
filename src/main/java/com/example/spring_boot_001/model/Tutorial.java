package com.example.spring_boot_001.model;

import com.example.spring_boot_001.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tutorials", schema="public")
public class Tutorial extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "level")
    private int level;

    @Column(name = "published")
    private boolean published;

    public Tutorial(String title, String description, int level, boolean published) {
        this.title = title;
        this.level = level;
        this.description = description;
        this.published = published;
    }
    public Tutorial() {}
}
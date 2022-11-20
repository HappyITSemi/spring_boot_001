package com.example.spring_boot_001.model;


import javax.persistence.*;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@Entity
@Table(name = "comments", schema="public")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_generator")
    private Long id;

    // @Lob
    private String content;

    //  @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tutorial_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Tutorial tutorial;

}

package com.example.spring_boot_001.model;

import com.example.spring_boot_001.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tutorial_details", schema = "public")
public class TutorialDetails extends BaseEntity {
    @Id
    private Long id;

    @Column
    private Date createdOn;

    @Column
    private String createdBy;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "tutorial_id")
    private Tutorial tutorial;

    public TutorialDetails() {
    }

    public TutorialDetails(String createdBy) {
        this.createdOn = new Date();
        this.createdBy = createdBy;
    }

    // getters and setters
}
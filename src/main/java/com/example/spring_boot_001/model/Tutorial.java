package com.example.spring_boot_001.model;

import com.example.spring_boot_001.entity.BaseEntity;
// import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @Data
@Setter
@Getter
@Entity
@Table(name = "tutorials", schema="public")
public class Tutorial extends BaseEntity {

/** @GeneratedValue(strategy = GenerationType.AUTO)  For MySQL */

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorial_generator")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "level")
    private int level;

    @Column(name = "published")
    private boolean published;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "tutorial_tags",
            joinColumns = { @JoinColumn(name = "tutorial_id") },
            inverseJoinColumns = { @JoinColumn(name = "tag_id") })
    private Set<Tag> tags = new HashSet<>();


    public Tutorial(String title, String description, int level, boolean published) {
        this.title = title;
        this.level = level;
        this.description = description;
        this.published = published;
    }
    public Tutorial() {}

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
        tag.getTutorials().add(this);
    }

    public void removeTag(long tagId) {
        Tag tag = this.tags.stream().filter(t -> t.getId() == tagId).findFirst().orElse(null);
        if (tag != null) {
            this.tags.remove(tag);
            tag.getTutorials().remove(this);
        }
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}
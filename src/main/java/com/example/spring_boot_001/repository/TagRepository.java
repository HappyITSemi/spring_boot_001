package com.example.spring_boot_001.repository;

import java.util.List;

import com.example.spring_boot_001.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TagRepository extends JpaRepository<Tag, Long> {
    List<Tag> findTagsByTutorialsId(Long tutorialId);
}
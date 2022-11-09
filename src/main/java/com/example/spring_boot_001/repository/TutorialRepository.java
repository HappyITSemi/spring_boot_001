package com.example.spring_boot_001.repository;

import com.example.spring_boot_001.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*
Now we can use JpaRepository’s methods:
 save(), findOne(), findById(), findAll(), count(), delete(), deleteById()…
 without implementing these methods.

We also define custom finder methods:
– findByPublished(): returns all Tutorials with published having value as input published.
– findByTitleContaining(): returns all Tutorials which title contains input title.
 */
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
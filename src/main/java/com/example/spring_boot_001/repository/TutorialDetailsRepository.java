package com.example.spring_boot_001.repository;

import javax.transaction.Transactional;

import com.example.spring_boot_001.model.TutorialDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialDetailsRepository extends JpaRepository<TutorialDetails, Long> {
    @Transactional
    void deleteById(long id);

    @Transactional
    void deleteByTutorialId(long tutorialId);
}

package com.example.spring_boot_001.repository;

import java.util.List;
import javax.transaction.Transactional;
import com.example.spring_boot_001.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTutorialId(Long postId);

    @Transactional
    void deleteByTutorialId(long tutorialId);
}
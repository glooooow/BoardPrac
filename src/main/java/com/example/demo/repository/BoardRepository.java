package com.example.demo.repository;

import com.example.demo.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Optional<Board> findById(Long id);
    Board findBoardById(Long id);
    List<Board> findAllByOrderByCreatedAtDesc();
}

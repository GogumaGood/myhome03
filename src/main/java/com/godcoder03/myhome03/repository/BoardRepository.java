package com.godcoder03.myhome03.repository;

import com.godcoder03.myhome03.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}

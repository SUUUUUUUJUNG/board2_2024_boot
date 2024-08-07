package com.example.board2_2024_boot.repository;

import com.example.board2_2024_boot.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

}

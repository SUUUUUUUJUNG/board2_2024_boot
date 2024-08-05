package com.example.board2_2024_boot.service;

import com.example.board2_2024_boot.dto.MemberDTO;
import com.example.board2_2024_boot.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void save(MemberDTO memberDTO) {

    }
}

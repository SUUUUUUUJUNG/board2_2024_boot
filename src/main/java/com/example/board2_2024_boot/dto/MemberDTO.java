package com.example.board2_2024_boot.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {
    private  Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;

}

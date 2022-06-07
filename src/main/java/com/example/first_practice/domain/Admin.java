package com.example.first_practice.domain;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor  //Lombok annotation 으로 파라미터가 없는 구성자를 대신 생성해줌
@AllArgsConstructor // " 클래스의 모든 필드값을 파라미터로 가지는 구성자를 생성해줌
@Getter // " Get 메소드 자동으로 만들어줌
@Setter// " Set 메소드 자동으로 만들어줌
@ToString
public class Admin {

    private String adminId;
    private String adminRole;
    private String adminPwd;
    private String adminName;
    private String subDept;
    private String email;
    private String companyTel;
    private String mobileTel;
    private String useYn;
    private LocalDate regDT;
    private String regId;
    private LocalDate updateDT;


}

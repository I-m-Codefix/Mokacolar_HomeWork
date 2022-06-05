package com.example.first_practice.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
public class Account {

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

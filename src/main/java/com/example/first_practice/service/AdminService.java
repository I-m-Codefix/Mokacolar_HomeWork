package com.example.first_practice.service;

import com.example.first_practice.domain.Admin;
import com.example.first_practice.repository.AdminRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AdminService {

    private final AdminRepository adminRepository;

    @Autowired //생성자가 하나만 있으면 생략 가능
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin createAdmin(Admin admin){
        log.info("createAdmin 호출 : "+admin.getAdminId()+"를 Repository에 저장합니다.");
        adminRepository.save(admin);

        return admin;
    }
}

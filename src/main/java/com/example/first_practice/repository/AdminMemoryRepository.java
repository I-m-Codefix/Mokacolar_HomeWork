package com.example.first_practice.repository;

import com.example.first_practice.domain.Admin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class AdminMemoryRepository implements AdminRepository {

    @Override
    public Admin save(Admin admin) {
        log.info("save 호출 : "+admin.toString()+"이 DB에 저장됐습니다.");
        return admin;
    }
}

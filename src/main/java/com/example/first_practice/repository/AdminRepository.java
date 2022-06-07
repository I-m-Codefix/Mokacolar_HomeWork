package com.example.first_practice.repository;

import com.example.first_practice.domain.Admin;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

public interface AdminRepository {

    Admin save(Admin admin);

}

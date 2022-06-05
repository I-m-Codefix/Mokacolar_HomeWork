package com.example.first_practice.controller;

import com.example.first_practice.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AdminController {

    @Autowired //@Autowired와 @Bean, @primary 그리고 @resonsebody의 이해
    private AdminService adminService;

    @GetMapping("/request1")
    public String getRequest(){

        return "요청";
    }




}

package com.example.first_practice.controller;

import com.example.first_practice.aop.LogExecutionTime;
import com.example.first_practice.domain.Admin;
import com.example.first_practice.service.AdminService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class AdminController {

    @Autowired //@Autowired와 @Bean, @primary 그리고 @resonsebody의 이해
    private AdminService adminService;

    @LogExecutionTime //새로 정의하는 Annotation
    @GetMapping("/request1")
    public String getRequest(){
        log.info("getRequest 호출");

        Admin ad = new Admin();
        ad.setAdminId("mokacolar");
        ad.setAdminName("jinyong");
        ad.setAdminPwd("111111");
        ad.setAdminRole("primary");
        log.trace(ad.getAdminId()+"의 요청 trace");
        log.debug(ad.getAdminId()+"의 요청 debug");
        log.info(ad.getAdminId()+"의 요청 info");

        adminService.createAdmin(ad);

        return ad.getAdminId();
    }

    @PostMapping("/request1")
    public String postRequest(){
        Admin ad = new Admin();
        ad.setAdminId("mokacolar");
        ad.setAdminName("jinyong");
        ad.setAdminPwd("111111");
        ad.setAdminRole("primary");
        log.trace(ad.getAdminId()+"의 요청 trace");
        log.debug(ad.getAdminId()+"의 요청 debug");
        log.info(ad.getAdminId()+"의 요청 info");
        return ad.toString();
    }




}

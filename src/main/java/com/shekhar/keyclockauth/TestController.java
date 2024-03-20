package com.shekhar.keyclockauth;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/userRole")
    @PreAuthorize("hasRole('client_user')")
    public String userTest(){
        return "User Api called";
    }
    @GetMapping("/adminRole")
    @PreAuthorize("hasRole('client_admin')")
    public String adminTest(){
        return "Admin api called";
    }
}

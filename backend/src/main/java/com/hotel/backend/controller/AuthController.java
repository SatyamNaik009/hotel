package com.hotel.backend.controller;

import com.hotel.backend.dto.LoginRequestDto;
import com.hotel.backend.dto.Response;
import com.hotel.backend.entity.User;
import com.hotel.backend.service.interf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Response> register(@RequestBody User user) {
        Response response = userService.register(user);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

    @PostMapping("/login")
    public ResponseEntity<Response> login(@RequestBody LoginRequestDto loginRequest) {
        Response response = userService.login(loginRequest);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }
}

package com.hicode.springutilities.controller;

import com.hicode.springutilities.exception.NotFoundException;
import com.hicode.springutilities.response.APIResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity<?> home(){

        return APIResponse.ok("Hello");
    }
}

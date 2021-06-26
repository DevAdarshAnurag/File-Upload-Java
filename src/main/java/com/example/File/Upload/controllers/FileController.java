package com.example.File.Upload.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    @GetMapping("/hello")
    String hello()
    {
        return "Hello!";
    }
}

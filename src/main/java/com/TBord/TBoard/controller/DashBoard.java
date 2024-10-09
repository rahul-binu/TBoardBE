package com.TBord.TBoard.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DashBoard {

    @GetMapping("/")
    public String main(@RequestParam (value = "param", required = false, defaultValue="ok") String param) {
        return "TheDashboard";
    }
    
}

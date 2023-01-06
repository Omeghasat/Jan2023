package com.example.Jan2023.controller;


import com.example.Jan2023.Service.Customerinfoservice;
import com.example.Jan2023.model.Customerinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping ("/Customerinfo")

public class CustomerinfoController {

    @Autowired
    Customerinfoservice service;

    @GetMapping("/all")
    public List<Customerinfo> getAllCustomerinfo(){
        return service.getAllCustomerinfo();
    }
}

package com.example.Jan2023.Service;

import com.example.Jan2023.model.Customerinfo;
import com.example.Jan2023.repository.CustomerinfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class Customerinfoservice {

    @Autowired
    CustomerinfoRepository repo;

    public List<Customerinfo> getAllCustomerinfo(){
        return repo.findAll();

    }
}

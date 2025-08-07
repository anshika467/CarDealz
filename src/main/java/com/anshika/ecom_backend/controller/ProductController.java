package com.anshika.ecom_backend.controller;

import com.anshika.ecom_backend.model.Product;
import com.anshika.ecom_backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet() {
        return "Hey Billionaire!!!";
    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

}

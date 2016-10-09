package com.musicstore.controller;

import com.musicstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ayush on 10/8/2016.
 */

@Controller
public class HomeController {

    ProductService productService;

    @Autowired
    public HomeController(ProductService productService){
        this.productService = productService;
    }
    @RequestMapping("/")
    public String home(Model model){
        //model.addAttribute("users",productService.findByName("product1"));
        return "home";
    }
}

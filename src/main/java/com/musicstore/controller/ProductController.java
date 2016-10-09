package com.musicstore.controller;

import com.musicstore.dao.Product;
import com.musicstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ayush on 10/8/2016.
 */

@Controller
@RequestMapping("/product")
public class ProductController {

    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String getAllProducts(Model model) {
        model.addAttribute("users",productService.findAll());
        return "productList";
    }

    @RequestMapping(value = "/viewProduct", method = RequestMethod.GET)
    public String getProduct() {
        return "viewProduct";
    }


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody  String test() {
        System.out.println("List = " + productService.findAll());
        return "test";
    }
}

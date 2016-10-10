package com.musicstore.controller;

import com.musicstore.dao.Product;
import com.musicstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ayush on 10/9/2016.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    ProductService productService;

    @Autowired
    public AdminController(ProductService productService){
        this.productService= productService;
    }

    @RequestMapping("/")
    public String adminHome(){
        return "admin";
    }

    @RequestMapping("/productInventory")
    public String producyInventory(Model model){
        model.addAttribute("products",productService.findAll());
        return "productInventory";
    }

    @RequestMapping("/productInventory/addProduct")
    public String addInventory(Model model ){
        Product product = new Product();
        product.setCategory("instrument");
        product.setProductCondition("new");
        product.setProductStatus("active");
        model.addAttribute("product",product);
        return "addProduct";
    }
    @RequestMapping(value = "/productAddAction", method = RequestMethod.POST)
    public String addProductAction(@ModelAttribute Product product){
        productService.save(product);
        return "redirect:/admin/productInventory";
    }
}

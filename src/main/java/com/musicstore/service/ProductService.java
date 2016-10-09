package com.musicstore.service;

import com.musicstore.dao.Product;

import java.util.List;

/**
 * Created by Ayush on 10/8/2016.
 */

public interface ProductService  {
    Product findByName(String name);
    List<Product> findAll();
    Product findById(Long id);
}

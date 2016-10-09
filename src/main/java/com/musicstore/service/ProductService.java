package com.musicstore.service;

import com.musicstore.dao.Product;
import com.musicstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ayush on 10/8/2016.
 */

public interface ProductService  {
    Product findByName(String name);
    List<Product> findAll();
}

package com.musicstore.service;

import com.musicstore.dao.Product;
import com.musicstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ayush on 10/8/2016.
 */
@Service
public class ProductServiceImpl implements  ProductService{

    ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    public Product findByName(String name){
       return productRepository.findByName(name);
    }
    public List<Product> findAll(){
        List<Product> list = new ArrayList<Product>();
        list= productRepository.findAllByOrderByName();
        return list;
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id);
    }

}

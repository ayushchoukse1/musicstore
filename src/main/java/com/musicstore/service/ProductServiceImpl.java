package com.musicstore.service;

import com.musicstore.dao.Product;
import com.musicstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ayush on 10/8/2016.
 */
@Service
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findByProductName(String name) {

        return productRepository.findByProductName(name);
    }

    public List<Product> findAll() {

        return productRepository.findAllByOrderByProductName();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id);
    }


    @Override
    public void save(Product product) {
        productRepository.save(product);
    }
}

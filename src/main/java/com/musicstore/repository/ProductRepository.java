package com.musicstore.repository;

import com.musicstore.dao.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Ayush on 10/8/2016.
 */

public interface ProductRepository extends CrudRepository<Product, Long> {

    Product findByName(String name);

    List<Product> findAllByOrderByName();
}

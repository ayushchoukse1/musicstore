package com.musicstore.dao;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Ayush on 10/8/2016.
 */
@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(nullable = false)
    String productName;
    String category;
    String description;

    @Column(nullable = false)
    double price;
    String productCondition;
    String productStatus;

    int unitInStocks;
    String manufacturer;


    public Product() {
    }



}

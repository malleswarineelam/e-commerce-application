package com.stschool.ecommerce.repository;

import com.stschool.ecommerce.model.Product;
import com.stschool.ecommerce.util.CsvParser;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ProductRepository {
    /*CURD OPERATIONS ON PRODUCTS

     */
    private final List<Product> products;


    public ProductRepository() throws IOException {
        CsvParser csvParser = new CsvParser();
        products = csvParser.getProductsFromCsv();

    }
    public Product save(Product product) {
        this.products.add(product);
        return product;
    }

    public Optional<Product> getById(int id){
        products.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
    }
    public List<Product> getAll(){
        return this.products;
    }

    
}

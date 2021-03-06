package com.ekin.ssm.service;

import com.ekin.ssm.entity.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;
}

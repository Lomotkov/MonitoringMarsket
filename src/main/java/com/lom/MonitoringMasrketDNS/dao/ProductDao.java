package com.lom.MonitoringMasrketDNS.dao;

import com.lom.MonitoringMasrketDNS.model.Product;

import java.util.List;

public interface ProductDao {
    public void addNewProduct(Product product);

    public List<Product> getProduct(String productKey);
}

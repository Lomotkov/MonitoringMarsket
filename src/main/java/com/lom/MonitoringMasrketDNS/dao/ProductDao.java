package com.lom.MonitoringMasrketDNS.dao;

import com.lom.MonitoringMasrketDNS.model.Product;

import java.util.List;

public interface ProductDao {
    public void addNewProduct(Product product);

    public Product getProduct(String productKey);
}

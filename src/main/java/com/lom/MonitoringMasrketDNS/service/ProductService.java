package com.lom.MonitoringMasrketDNS.service;

import com.lom.MonitoringMasrketDNS.model.Product;

import java.util.List;

public interface ProductService {
    public void addNewProduct(Product product);

    public Product getProduct(String productKey);
}

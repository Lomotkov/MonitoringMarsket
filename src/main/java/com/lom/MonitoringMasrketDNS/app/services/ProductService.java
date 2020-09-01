package com.lom.MonitoringMasrketDNS.app.services;

import com.lom.MonitoringMasrketDNS.model.Product;

public interface ProductService {
    public void addNewProduct(Product product);

    public Product getProduct(String productKey);
}

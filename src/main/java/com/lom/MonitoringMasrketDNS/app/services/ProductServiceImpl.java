package com.lom.MonitoringMasrketDNS.app.services;

import com.lom.MonitoringMasrketDNS.dao.ProductDao;
import com.lom.MonitoringMasrketDNS.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductDao productDao;

    @Autowired
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    @Transactional
    public void addNewProduct(Product product) {
        productDao.addNewProduct(product);
    }

    @Override
    @Transactional
    public Product getProduct(String productKey) {
        return productDao.getProduct(productKey);
    }
}

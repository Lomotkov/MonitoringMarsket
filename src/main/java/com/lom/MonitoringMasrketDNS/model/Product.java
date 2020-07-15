package com.lom.MonitoringMasrketDNS.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
@Table(name = "Product", schema = "public")
public class Product {
    @Column(name = "KEY")
    private String key;
    @Column(name = "LINK")
    private String link;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private int price;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "key='" + key + '\'' +
                ", link='" + link + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

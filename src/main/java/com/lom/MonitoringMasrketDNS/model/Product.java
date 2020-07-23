package com.lom.MonitoringMasrketDNS.model;

import javax.persistence.*;
import java.util.Date;

@Embeddable
@Table(name = "Product", schema = "public")
public class Product {
    @Id
    @Column(name = "KEY")
    private String key;
    @Column(name = "LINK")
    private String link;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private int price;
    @Column(name = "DATE_OF_SNAPSHOT")
    private Date dateOfSnapshot;

    public Product(String key, String link, String name, int price, Date dateOfSnapshot) {
        this.key = key;
        this.link = link;
        this.name = name;
        this.price = price;
        this.dateOfSnapshot = dateOfSnapshot;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getDateOfSnapshot() {
        return dateOfSnapshot;
    }

    public void setDateOfSnapshot(Date dateOfSnapshot) {
        this.dateOfSnapshot = dateOfSnapshot;
    }

    @Override
    public String toString() {
        return "Product{" +
                "key='" + key + '\'' +
                ", link='" + link + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", dateOfSnapshot=" + dateOfSnapshot +
                '}';
    }
}

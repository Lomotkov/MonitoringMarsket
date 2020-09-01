package com.lom.MonitoringMasrketDNS.model;

import javax.persistence.*;

@Entity
@Table(name = "UserNeeds", schema = "public")
public class UserNeeds {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "USER_ID")
    private long userId;
    @Column(name = "USER_NEED_KEY")
    private String productKey;
    @Column(name = "NEED_PRICE")
    private int needPrice;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "LINK")
    private String link;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    public int getNeedPrice() {
        return needPrice;
    }

    public void setNeedPrice(int needPrice) {
        this.needPrice = needPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "UserNeeds{" +
                "id=" + id +
                ", userId=" + userId +
                ", productKey='" + productKey + '\'' +
                ", needPrice=" + needPrice +
                ", productName='" + productName + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}

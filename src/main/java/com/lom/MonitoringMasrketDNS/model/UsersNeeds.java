package com.lom.MonitoringMasrketDNS.model;

import javax.persistence.*;

@Embeddable
@Table(name = "UserNeeds", schema = "public")
public class UsersNeeds {
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

    public UsersNeeds(long userId, String productKey, int needPrice) {
        this.userId = userId;
        this.productKey = productKey;
        this.needPrice = needPrice;
    }

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

    @Override
    public String toString() {
        return "UsersNeeds{" +
                "id=" + id +
                ", userId=" + userId +
                ", productKey='" + productKey + '\'' +
                ", needPrice=" + needPrice +
                '}';
    }
}

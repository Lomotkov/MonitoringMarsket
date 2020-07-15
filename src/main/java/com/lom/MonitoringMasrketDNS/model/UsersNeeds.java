package com.lom.MonitoringMasrketDNS.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
@Table(name = "UserNeeds", schema = "public")
public class UsersNeeds {
    @Column(name = "USER_ID")
    private long userId;
    @Column(name = "USER_NEED_LINK")
    private String userNeedLink;
    @Column(name = "USER_NEED_KEY")
    private String productKey;
    @Column(name = "NEED_PRICE")
    private int needPrice;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserNeedLink() {
        return userNeedLink;
    }

    public void setUserNeedLink(String userNeedLink) {
        this.userNeedLink = userNeedLink;
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
                "userId=" + userId +
                ", userNeedLink='" + userNeedLink + '\'' +
                ", productKey='" + productKey + '\'' +
                ", needPrice=" + needPrice +
                '}';
    }
}

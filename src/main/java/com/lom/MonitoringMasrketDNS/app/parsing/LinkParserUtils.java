package com.lom.MonitoringMasrketDNS.app.parsing;

public class LinkParserUtils {

    public static String getKeyFromLink(String link) {
        if(link.contains("https://www.dns-shop.ru/product/")) {
            String[] parts = link.split("/");
            return parts[4];
        } else {
            return null;
        }
    }
}

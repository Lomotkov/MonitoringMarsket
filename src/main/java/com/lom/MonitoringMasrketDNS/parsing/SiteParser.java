package com.lom.MonitoringMasrketDNS.parsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class SiteParser {
    public static String getProductPrice(String url) {
        Document doc = Jsoup.parse( "UTF-8", url);
        Elements element = doc.getElementsByClass("current-price-value");
        return "";
    }
}

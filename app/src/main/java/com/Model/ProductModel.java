package com.Model;

public class ProductModel {
    private String productImageUrl;
    private String productName;
    private String productPrice;
    private String saleArea;

    public ProductModel(String productImageUrl, String productName, String productPrice, String saleArea) {
        this.productImageUrl = productImageUrl;
        this.productName = productName;
        this.productPrice = productPrice;
        this.saleArea = saleArea;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getSaleArea() {
        return saleArea;
    }

    public void setSaleArea(String saleArea) {
        this.saleArea = saleArea;
    }
}

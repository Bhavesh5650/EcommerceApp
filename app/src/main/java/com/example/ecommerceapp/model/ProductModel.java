package com.example.ecommerceapp.model;

public class ProductModel {

    public int image;
    public String pro_name;
    public String price;
    public String[] feature;

    public ProductModel(int image,String pro_name,String price,String[] feature) {
        this.image = image;
        this.pro_name = pro_name;
        this.price = price;
        this.feature = feature;
    }
}

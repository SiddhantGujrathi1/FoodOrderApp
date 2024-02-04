package com.example.foodorderapp.Models;

import androidx.recyclerview.widget.RecyclerView;

public class OrdersModel {

    int orderImage;
    String soldItemName , orderNumber , price;

    public OrdersModel(int orderImage, String soldItemName, String orderNumber, String price) {
        this.orderImage = orderImage;
        this.soldItemName = soldItemName;
        this.orderNumber = orderNumber;
        this.price = price;
    }

    public int getOrderImage() {
        return orderImage;
    }

    public String getSoldItemName() {
        return soldItemName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setOrderImage(int orderImage) {
        this.orderImage = orderImage;
    }

    public void setSoldItemName(String soldItemName) {
        this.soldItemName = soldItemName;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

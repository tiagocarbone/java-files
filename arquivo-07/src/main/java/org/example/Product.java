package org.example;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;

    public Product(String name, double value, int quantity) {
        this.name = name;
        this.price = value;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return price;
    }

    public void setValue(double value) {
        this.price = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double total(){
        return price * quantity;
    }

}

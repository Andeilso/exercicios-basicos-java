package models.entities;

public class Product {
    private String name;
    private double value;
    private int quantity;

    public Product(){
    }

    public Product(String name, double value, int quantity){
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getValue(){
        return this.value;
    }

    public void setValue(double value){
        this.value = value;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double totalValue(){
        return getValue() * (double)getQuantity();
    }
}

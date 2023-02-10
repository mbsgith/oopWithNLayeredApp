package oopWithNLayeredApp.entities.concretes;

import oopWithNLayeredApp.entities.abstracts.Entity;

public class Product implements Entity {
    private int id;
    private String name;
    private double unitPrice;

    //Constructor
    public Product() {
    }

    //Constructor with variables
    public Product(int id, String name, double unitPrice) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}

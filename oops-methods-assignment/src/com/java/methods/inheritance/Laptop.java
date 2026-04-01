package com.java.methods.inheritance;

public class Laptop extends Product{
    int hardDiskSize;
    String operatingSystem;
    int ram;
    String graphicCard;
    long price;

    public Laptop(){
        super();
        System.out.println("Laptop constructor called");
    }

    public Laptop(boolean isAvailable, float discountPercentage, int maxRetailPrice, String name, int id, String graphicCard, long price, int ram, String operatingSystem, int hardDiskSize) {
        super(isAvailable, discountPercentage, maxRetailPrice, name, id);
        this.graphicCard = graphicCard;
        this.price = price;
        this.ram = ram;
        this.operatingSystem=operatingSystem;
        this.hardDiskSize = hardDiskSize;
    }

    void displayLaptopDetails(){
        displayProductDetails();
        System.out.println("Hard Disk: " +hardDiskSize);
        System.out.println("Operating System: " +operatingSystem);
        System.out.println("Ram: " +ram);
        System.out.println("price: " +price);
        System.out.println("Graphic Card: " +graphicCard);
    }
}

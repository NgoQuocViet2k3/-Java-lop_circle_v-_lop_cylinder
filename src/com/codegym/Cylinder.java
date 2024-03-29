package com.codegym;

public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Math.pow(super.getArea(),2);
    }

    @Override
    public String toString() {
        return "Hình trụ có: " + "radius= " + super.getRadius() + " , color= " + super.getColor() + ", height= " + height + ", thể tích của hình trụ là " + getVolume();
    }
}

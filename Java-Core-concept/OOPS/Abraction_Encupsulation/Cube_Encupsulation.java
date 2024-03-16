package OOPS.Abraction_Encupsulation;

import OOPS.Inherritence.Boxs;

public class Cube_Encupsulation extends Abstraction {
    private double length;
    private double height;
    public double width;

    public void display() {
        System.out.println("length - " + length + ".inch");
        System.out.println("height - " + height + ".inch");
        System.out.println("width  - " + width + ".inch");
    }

    public Cube_Encupsulation() {
        length = 0.0;
        height = 0.0;
        width = 0.0;
    }

    public void set_size(double same) {
        length = same;
        height = same;
        width = same;
    }

    public void set_size(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public void copy_sized(Boxs other) {
        this.width = other.width;
        this.length = other.length;
        this.height = other.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // default function that will run without create
    @Override
    public int hashCode() {                   // hashCode it will give random unique number
        return 45;              // can modify them
    }

    @Override
    public boolean equals(Object obj)
    {
        return this.height == ((Cube_Encupsulation)obj).height;  // allow us to perform check if the certain object value is equal are not
    }

    @Override
    public String toString() {
        System.out.println("Parent Class name - Abstraction");
        System.out.println("Parent Class path - OOPS.Abraction_Encupsulation.Abstraction");
        System.out.println("class path - OOPS.Abraction_Encupsulation");
        System.out.print("class name - ");
        return "Cube_Encupsulation";            // if nothing then the in pRintln this will perform "Packagepath+Classname+@+someRandomHashValue"
    }


}

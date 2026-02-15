import java.util.Scanner;

public class Cylinder {
    //instance data for the radius of the base, and the height of the cylinder.
    double radius;
    double height;

    //a constructor that accepts and initializes the radius and height.
    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    //getter and setter methods for both instance variables.
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //a method that calculates and returns the volume of the cylinder
    double volume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    //a method that calculates and returns the total surface area of the cylinder
    double surfaceArea(double r, double h) {
        return 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * h;
    }

    // Override the toString() method to return a single-line description of the cylinder,
    //including its radius and height
    @Override
    public String toString() {
        return String.format("Cylinder Details \nCylinder [radius=%.1f, height=%.1f]\nSurface Area = %.2f\nVolume = %.2f", radius, height, surfaceArea(radius, height),volume(radius,height));
    }

    //main class
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, h;
        //Reads the radius and height from the user.
        System.out.print("Enter radius: ");
        r = input.nextDouble();
        System.out.print("Enter height: ");
        h = input.nextDouble();
        System.out.print("Enter new radius: ");
        r = input.nextDouble();
        //Creates a Cylinder object using the constructor.
        Cylinder cylinder = new Cylinder(r, h);
        //Displays the cylinder’s details, including:
        //radius
        //height
        //surface area
        //volume
        System.out.println(cylinder);
    }
}
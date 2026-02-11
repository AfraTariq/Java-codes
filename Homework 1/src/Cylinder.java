import java.util.Scanner;

public class Cylinder {
    double radius;
    double height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

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

    double volume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    double surfaceArea(double r, double h) {
        return 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * h;
    }

    @Override
    public String toString() {
        return String.format("Cylinder Details \nCylinder [radius=%.1f, height=%.1f]\nSurface Area = %.2f\nVolume = %.2f", radius, height, surfaceArea(radius, height),volume(radius,height));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, h;
        System.out.println("Enter radius: ");
        r = input.nextDouble();
        System.out.println("Enter height: ");
        h = input.nextDouble();
        System.out.println("Enter new radius: ");
        r = input.nextDouble();
        Cylinder cylinder = new Cylinder(r, h);
        System.out.println(cylinder);
    }
}
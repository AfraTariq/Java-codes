public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(String c, double w, double h) {
        super(c);
        width = w;
        height = h;
    }
    public double getArea(){
        return width*height;
    }
    public String toString(){
        return String.format("Rectangle[color=%s, width=%.2f, height=%.2f, area=%.2f].",getColor(), width, height, getArea());
    }
}

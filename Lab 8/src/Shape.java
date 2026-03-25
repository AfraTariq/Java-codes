public class Shape {
    private String color;

    public Shape(){
        color = "red";
    }
    public Shape(String c){
        color = c;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return 0.0;
    }
    public String toString(){
        return "Shape[color="+color+"]";
    }
}

public class Square extends Rectangle{
    private double side;

    public Square(String color, double s){
        super(color,s,s);
        side=s;
    }
    public String toString(){
        return String.format("Square[color=%s, side=%.2f, area=%.2f].",getColor(), side, getArea());
    }
}

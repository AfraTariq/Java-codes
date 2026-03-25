import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Rectangle ---");
        System.out.print("Enter color: ");
        String c = input.nextLine();
        System.out.print("Enter width: ");
        double w=input.nextDouble();
        System.out.print("Enter height: ");
        double h=input.nextDouble();

        Rectangle rectangle= new Rectangle(c,w,h);

        System.out.println();
        System.out.println("--- Square ---");
        input.nextLine();
        System.out.print("Enter color: ");
        String c1 = input.nextLine();
        System.out.print("Enter side: ");
        double s=input.nextDouble();

        Square square= new Square(c1,s);
        Shape [] shapes = new Shape[2];
        shapes[0]=rectangle;
        shapes[1]=square;
        System.out.println();
        System.out.println("--- All Shapes ---");
        for(int i=0;i<2;i++){
            System.out.println(shapes[i]);
            System.out.printf("Area: %.2f %n",shapes[i].getArea());
        }
    }
}

import java.util.Scanner;

public class Excersice_2 {
    public static void main(String[] args)
    {
        Scanner console = new Scanner (System.in);

        System.out.println("Please enter 2 numbers and text: ");

        int I=console.nextInt();
        double D=console.nextDouble();
        String S1=console.next();
        String S2=console.nextLine();

        System.out.println("myInt = "+I);
        System.out.println("myDouble = "+D);
        System.out.println("myString1 = "+S1);
        System.out.println("myString2 = "+S2);
        System.out.println("The total sum of the two numbers is "+(I+D));
    }
}

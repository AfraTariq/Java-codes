import java.util.Scanner;

public class CompareFloat
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double d1, d2, d3;
        System.out.print("Enter three double numbers: ");
        double n1=input.nextDouble()*1000;
        double n2=input.nextDouble()*1000;
        double n3=input.nextDouble()*1000;
        n1= Math.round(n1)/1000.0;
        n2= Math.round(n2)/1000.0;
        n3= Math.round(n3)/1000.0;
        if(n1==n2 && n2==n3 && n3==n1)
            System.out.println("All three numbers are the same when rounded to three decimal places.");
        else
            System.out.println("The numbers are different when rounded to three decimal places.");
        d1=Math.abs(n1-n2);
        d2=Math.abs(n1-n3);
        d3=Math.abs(n2-n3);
        if(d1<0.001 || d2<0.001 || d3<0.001)
            System.out.println("The difference between the numbers is less than 0.001.");
        else
            System.out.println("The difference between the numbers is greater than 0.001.");
    }
}

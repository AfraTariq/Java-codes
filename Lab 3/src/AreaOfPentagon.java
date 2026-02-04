import java.util.Scanner;

public class AreaOfPentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, noOfPentagons, side;
        double total = 0.0, area;
        System.out.print("Enter the number of pentagons: ");
        noOfPentagons = input.nextInt();
        while (i <= noOfPentagons) {
            System.out.print("Enter the side length of pentagon " + i + " : ");
            side = input.nextInt();
            area = (1.0 / 4) * Math.sqrt((5 * (5 + 2 * Math.sqrt(5)))) * Math.pow(side, 2);
            total += area;
            i++;
        }
        System.out.printf("The total area of the pentagons is: %.2f", total);
    }
}

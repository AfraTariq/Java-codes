import java.util.Scanner;

public class ParkingFeeCalc {
    /**
     * this is the main method
     *
     * @param args input parameters
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;
        final int carPerHour = 3;
        final int bikePerHour = 2;
        final int truckPerHour = 7;
        int parkingHours, parkingFee = 0;
        String vehicleType;

        while (continueProgram) {

            System.out.println("Welcome to the Smart Parking System!");
            System.out.println("Choose an option:");
            System.out.println("1. Calculate Parking Fee");
            System.out.println("2. Exit");
            System.out.print("Enter your choice (1 or 2): ");
            int option = scanner.nextInt();
            switch (option) {
                // Task 1: If option 1 is selected, calculate parking fee
                case 1:
                    System.out.println("Enter vehicle type: ");
                    vehicleType = scanner.next();
                    System.out.println("Enter number of parking hours: ");
                    parkingHours = scanner.nextInt();
                    if (parkingHours > 0) {
                        if (vehicleType.equalsIgnoreCase("Car")) {
                            if (parkingHours > 0) {
                                if (parkingHours == 1) {
                                    parkingFee = 5;
                                } else {
                                    parkingFee = 5 + (parkingHours - 1) * carPerHour;
                                }
                            }
                        }
                        else if (vehicleType.equalsIgnoreCase("Bike")) {
                            if (parkingHours > 0) {
                                if (parkingHours == 1) {
                                    parkingFee = 3;
                                } else {
                                    parkingFee = 3 + (parkingHours - 1) * bikePerHour;
                                }
                            }
                        }
                        else if (vehicleType.equalsIgnoreCase("Truck")) {
                            if (parkingHours > 0) {
                                if (parkingHours == 1) {
                                    parkingFee = 10;
                                } else {
                                    parkingFee = 10 + (parkingHours - 1) * truckPerHour;
                                }
                            }
                        }
                        else{
                            System.out.println("Invalid vehicle type!");

                        }
                        System.out.println("Total parking fee: " + parkingFee);
                    }
                    else {
                        System.out.println("Invalid parking duration!");
                    }
                    break;
                case 2:
                    System.out.println("Goodbye!");
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid option!");

            }


        }
    }
}
 /*
    Test cases:
    1.
    Input:  1, cAr, 0
    Output: Invalid parking duration!
    PASS
    2.
    Input: 1, TrucK, 12
    Output: Total parking fee: 87
    PASS
    3.
    Input: 1, Bike, 3
    Output: Total parking fee: 7
    PASS
    4.
    Input: 1, Bus, 4
    Output: Invalid vehicle type!
    PASS
    5.
    Input: 2
    Output: Goodbye!
    PASS
  */

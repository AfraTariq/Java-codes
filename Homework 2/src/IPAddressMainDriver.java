import java.io.FileWriter;
import java.util.Scanner;

public class IPAddressMainDriver {
    public static void main(String[] args) throws Exception {
        IPAddress [] IP= new IPAddress[100];
        String p1,p2,p3,p4;
        int size=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type an IP Address with 4 parts, each part separated by a space (ending with a -1). ");

        while(true) {
            if(size<100) {      //do this if size<100 (to not go beyond the bounds of the array)
                p1 = sc.next();     //read the first part
                if (p1.equals("-1"))        //if the first part is -1 exit
                    break;
                p2 = sc.next();     //read the second part
                p3 = sc.next();     //read the third part
                p4 = sc.next();     //read the fourth part
                IP[size] = new IPAddress(p1, p2, p3, p4);       //create a new object in the position in the list using the above read data
                size++;     //increment the variable to know how many IP Addresses are saved and to know which position the next object should be created at
            }
            else{
                System.out.println("Array full, cannot add more IPs.");
                break;
            }
        }
        //Making my test class interactive by adding the following options to let user do multiple tasks.
        int choice;
        System.out.println("Welcome to IP Address Management Software. \nWhat would you like to do today?");
        //keeps asking for a choice until the user chooses 6, that is to exit the menu
        do {
            System.out.println("\n1. Search for an IP Address");
            System.out.println("2. Count IPs starting with a value");
            System.out.println("3. Print all IP Addresses");
            System.out.println("4. Delete an IP");
            System.out.println("5. Print IP Addresses to file");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    searchIP(IP, size);
                    break;
                case 2:
                    countStartingValue(IP, size);
                    break;
                case 3:
                    printAll(IP, size);
                    break;
                case 4:
                    size= deleteIP(IP, size);
                    break;
                case 5:
                    saveToFile(IP, size);
                    break;
                case 6:
                    System.out.println("Goodbye! Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);
    }
    //Search for a particular IP address
    public static void searchIP(IPAddress[] list, int size) {
        System.out.println("Enter IP to search:");
        Scanner input = new Scanner(System.in);
        IPAddress search = new IPAddress(input.next(), input.next(), input.next(), input.next());

        for (int i = 0; i < size; i++) {
            if (list[i].compareIP(search)) {
                System.out.println("IP found.");
                return;
            }
        }
        System.out.println("IP not found.");
    }
    //Count how many IP addresses start with a particular value
    public static void countStartingValue(IPAddress[] list, int size) {
        System.out.print("Enter starting value: ");
        Scanner input = new Scanner(System.in);
        String value = input.next();

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (list[i].getPart1().equals(value))
                count++;
        }
        System.out.println("Total = " + count);
    }
    //Print all IP addresses
    public static void printAll(IPAddress[] list, int size) {
        for (int i = 0; i < size; i++)
            System.out.println("\n" + list[i].PrintIP());
    }
    //Delete a particular IP address (if it exists).
    public static int deleteIP(IPAddress[] list, int size) {
        System.out.println("Enter IP to delete:");
        Scanner input = new Scanner(System.in);
        IPAddress del = new IPAddress(input.next(), input.next(), input.next(), input.next());

        for (int i = 0; i < size; i++) {
            if (list[i].compareIP(del)) {
                for (int j = i; j < size - 1; j++)
                    list[j] = list[j + 1];
                System.out.println("IP deleted.");
                IPAddress.decnoOfIPAddress();
                return size-1;
            }
        }
        System.out.println("IP not found.");
        return size;
    }
    //Print all IP addresses to a file (the user will give the name of the file)
    public static void saveToFile(IPAddress[] list, int size) throws Exception {
        System.out.print("Enter file name: ");
        Scanner input = new Scanner(System.in);
        String filename = input.next();
        FileWriter out = new FileWriter(filename);

        for (int i = 0; i < size; i++)
            out.write(list[i].PrintIP() +"\n");

        out.close();
        System.out.println("IPs saved to file.");
    }
}



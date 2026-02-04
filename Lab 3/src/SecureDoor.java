import java.util.Scanner;

public class SecureDoor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final int code= 2023;
        int tryCounter=1;
        int userCode;
        while(true){
            if(tryCounter>3){
                System.out.println("Access denied! System locked. Please contact security.");
                break;
            }
            System.out.print("Enter access code: ");
            userCode=input.nextInt();
            if(userCode==code){
                System.out.println("Access granted");
                break;
            }
            else {
                System.out.println("Incorrect code! Please try again.");
            }
            tryCounter++;
        }
    }
}

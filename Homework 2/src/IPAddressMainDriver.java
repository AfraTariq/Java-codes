import java.util.Scanner;

public class IPAddressMainDriver {
    public static void main(String[] args) {
        IPAddress [] IP= new IPAddress[100];
        String p1,p2,p3,p4;
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type an IP Address with 4 parts, each part separated by a space (ending with a -1). ");
        while(sc.nextInt()!=-1) {
            p1 = sc.next();
            p2 = sc.next();
            p3 = sc.next();
            p4 = sc.next();
            IP[i] = new IPAddress(p1, p2, p3, p4);
            i++;
        }

    }
}

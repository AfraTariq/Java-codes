public class Main {
    public static void main(String[] args) {

        // Create array of patients (size 3)
        Patient[] patients = new Patient[3];

        // Initialize patients
        patients[0]=new InPatient("Ali"); // Ali
        patients[1]=new InPatient("Sara"); // Sara
        patients[2]=new InPatient("Omar"); // Omar

        // Loop through patients
        for (int i = 0; i < patients.length; i++) {

            // Display info
            patients[i].displayInfo();

            // Admit patient
            ((Admittable) patients[i]).admit();

            // Check vitals
            ((Monitorable)patients[i]).checkVitals();

            System.out.println();
        }

        Patient[] patients1 = new Patient[3];

        // Initialize patients with costs,
        patients1[0]=new InPatient("Ali",1000);// Ali, 1000 AED
        patients1[1]=new InPatient("Sara", 2000);// Sara, 2000 AED
        patients1[2]=new InPatient("Omar", 1500);// Omar, 1500 AED

        double totalRevenue = 0;

        for (int i = 0; i < patients1.length; i++) {

            double bill = patients1[i].calculateBill();

            totalRevenue += bill;

            ((Payable) patients1[i]).payBill(bill); // pay bill
        }
        System.out.println();
        System.out.println("Total Revenue: " + totalRevenue); // display the total revenue
    }
}

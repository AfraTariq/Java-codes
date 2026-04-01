public class InPatient extends Patient implements Admittable, Monitorable, Payable, Insurable{
    private double baseCost;

    public InPatient(String n, double bc) {
        super(n);
        baseCost = bc;
    }
    public InPatient(String n) {
        super(n);
    }

    @Override
    public void displayInfo() {
        System.out.println("Patient: " + name + " (In-Patient)");
    }
    public void admit(){
        System.out.println(name + " has been admitted.");
    }
    public void checkVitals(){
        System.out.println(name + "'s vitals are stable.");
    }

    public double applyInsurance(){
        return 0.3*baseCost;
    }
    public double calculateBill(){
        return baseCost-applyInsurance();
    }
    public void payBill(double amount){
        System.out.println(name + " paid: " + amount);
    }


}


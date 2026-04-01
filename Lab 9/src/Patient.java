public abstract class Patient {
    protected String name;

    public  Patient(String n) {
        name = n;
    }
    public abstract void displayInfo();
    public abstract double calculateBill();
}

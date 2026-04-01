public abstract class Patient extends Person {

    public  Patient(String n) {
        super(n);
    }
    public void role(){
        System.out.println(name + " is a Patient.");
    }
    public abstract double calculateBill();
}

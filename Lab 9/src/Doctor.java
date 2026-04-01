public class Doctor extends Person implements Treatable, Diagnosable{
    public Doctor(String n){
        super(n);
    }
    public void role(){
        System.out.println("Dr. " + name + " is a Doctor.");
    }
    public void diagnose(Patient p){
        System.out.println("Dr. " + name + " is diagnosing " + p.name);
    }
    public void treatPatient(Patient p){
        System.out.println("Dr. " + name + " is treating " + p.name);
    }
}

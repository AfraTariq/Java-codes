import java.util.Scanner;

public class FormAString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String newSentence="";
        System.out.print("Enter the first sentence: ");
        String sentence1= input.nextLine();
        System.out.print("Enter the second sentence: ");
        String sentence2= input.nextLine();
        for(int i=0;i<sentence1.length();i++){
            for (int j=0;j<sentence2.length();j++){
                if(sentence1.charAt(i)==sentence2.charAt(j)){
                    newSentence+=sentence1.charAt(i);
                    break;
                }
            }
        }
        System.out.println(newSentence.toUpperCase());
    }
}

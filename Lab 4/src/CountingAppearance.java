import java.util.Scanner;

public class CountingAppearance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int appearance=0, lowerAppearance=0, upperAppearance=0;
        System.out.print("Enter your sentence: ");
        String sentence = input.nextLine();
        String sentence1 = sentence.toLowerCase(); //creating a lowercase copy of the sentence to find only appearance
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);
        letter=Character.toLowerCase(letter); //making it lower case to compare with the lower case sentence
        for(int i=0;i<sentence.length();i++){
            if(sentence1.charAt(i)==letter){
                appearance++;
                if(Character.isLowerCase(sentence.charAt(i))){
                    lowerAppearance++;
                }
                if(Character.isUpperCase(sentence.charAt(i))){
                    upperAppearance++;
                }
            }
        }
        if(appearance>0)
            System.out.println("The letter "+letter+" appeared: "+appearance+" times"+" ("+lowerAppearance+" of them are lowercase and "+upperAppearance+" uppercase)");
        else
            System.out.println("The letter "+letter+" did not appear");
    }
}
import java.util.Scanner;

public class SimpleInteractiveProgram {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int spaces, k, start=0, end=0;
        String sentence="", reversedWord="";
        System.out.print("Enter a sentence with at least 6 words and ending with '!': ");
        while(true) {
            spaces=0;
            sentence = input.nextLine();
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    spaces++;
                }
            }
            if (spaces >= 5 && sentence.endsWith("!")) {
                System.out.print("Enter k (k > 5) to reverse the k-th word: ");
                k=input.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Make sure it has at least 6 words and end with '!'.");
                System.out.print("Enter again: ");
            }
        }
        spaces=0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                spaces++;
            }
            if(spaces==k-1){
                start=i+1;
            }
            if(spaces==k){
                end=i-1;
            }
        }
        for(int i=end;i>=start;i--){
            reversedWord+=sentence.charAt(i);
        }
        for(int i=0;i<reversedWord.length();i++){
            sentence= sentence.replace(sentence.charAt(start),reversedWord.charAt(i));
            start++;
        }
        sentence=sentence.replaceAll(" ","");
        sentence=sentence.replaceAll("!","$");
        for(int i=0;i<sentence.length();i++) {
            if (Character.isUpperCase(sentence.charAt(i))) {
                sentence = sentence.replace(Character.toLowerCase(sentence.charAt(i)), sentence.charAt(i));
            }
            if (Character.isLowerCase(sentence.charAt(i))) {
                sentence = sentence.replace(Character.toUpperCase(sentence.charAt(i)), sentence.charAt(i));
            }
        }
    }
}

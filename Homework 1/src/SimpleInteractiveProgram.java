import java.util.Scanner;

public class SimpleInteractiveProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int spaces, k, start = 0, end = 0;
        String sentence = "", reversedWord = "", newSentence = "";
        System.out.print("Enter a sentence with at least 6 words and ending with '!': ");
        while (true) {
            spaces = 0;
            sentence = input.nextLine();
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    spaces++;
                }
            }
            if (spaces >= 5 && sentence.endsWith("!")) {
                break;
            } else {
                System.out.println("Invalid input. Make sure it has at least 6 words and end with '!'.");
                System.out.print("Enter again: ");
            }
        }
        System.out.print("Enter k (k > 5) to reverse the k-th word: ");
        k = input.nextInt();
        while (true) {
            if (k > 5) {
                spaces = 0;
                for (int i = 0; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        spaces++;
                    }
                    if (spaces == k - 2) {
                        start = i + 1;
                    }
                    if (spaces == k - 1) {
                        end = i;
                    }
                }
                for (int i = end; i >= start; i--)
                    reversedWord += sentence.charAt(i);
                //System.out.println(reversedWord);

                newSentence = sentence.substring(end + 2);
                //System.out.println(newSentence);
                sentence = sentence.substring(0, start);
                sentence = sentence + reversedWord + newSentence;
                //System.out.println(sentence);
                newSentence = "";
                sentence = sentence.replace(" ", "");
                sentence = sentence.replace("!", "$");
                for (int i = 0; i < sentence.length(); i++) {
                    char ch = sentence.charAt(i);

                    if (Character.isUpperCase(ch)) {
                        newSentence += Character.toLowerCase(ch);
                    } else if (Character.isLowerCase(ch)) {
                        newSentence += Character.toUpperCase(ch);
                    } else {
                        newSentence += ch;
                    }
                }
                System.out.println("Modified message: " + newSentence);
                break;
            } else {
                System.out.println("Invalid value for k!");
                System.out.print("Enter k (k > 5) to reverse the k-th word: ");
                k = input.nextInt();
            }
        }
        char anotherCalc='y';
        int choice;
        double a,b;
        while (anotherCalc == 'y') {
            System.out.print("=== Part B: Math Calculations ===");
            System.out.println("\n Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Absolute value (abs)");
            System.out.println("6. Power (^)");
            System.out.println("7. Rounding (round to decimals)");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.print(" Enter first number: ");
                    a=input.nextDouble();
                    System.out.print(" Enter second number: ");
                    b=input.nextDouble();
                    System.out.println("Result = "+(a+b));
                    break;
                case 2:
                    System.out.print(" Enter first number: ");
                    a=input.nextDouble();
                    System.out.print(" Enter second number: ");
                    b=input.nextDouble();
                    System.out.println("Result = "+(a-b));
                    break;
                case 3:
                    System.out.print(" Enter first number: ");
                    a=input.nextDouble();
                    System.out.print(" Enter second number: ");
                    b=input.nextDouble();
                    System.out.println("Result = "+(a*b));
                    break;
                case 4:
                    System.out.print(" Enter first number: ");
                    a=input.nextDouble();
                    System.out.print(" Enter second number: ");
                    b=input.nextDouble();
                    if(b==0)
                        System.out.println("Cannot divide by zero");
                    else
                        System.out.println("Result = "+(a/b));
                    break;
                case 5:
                    System.out.print(" Enter a number: ");
                    a=input.nextDouble();
                    System.out.println("Result = "+ Math.abs(a));
                    break;
                case 6:
                    System.out.print(" Enter the number base: ");
                    a=input.nextDouble();
                    System.out.print(" Enter the power: ");
                    b=input.nextDouble();
                    System.out.println("Result = "+ Math.pow(a,b));
                    break;
                case 7:
                    System.out.print("Enter the number you want to round: ");
                    a=input.nextDouble();
                    System.out.println("Result = "+ Math.rint(a));
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid input!");
            }
            if(choice==0){
                break;
            }
            System.out.print("Do you want to do another calculation? (y/n): ");
            anotherCalc=input.next().charAt(0);

        }
        System.out.print("Program ended.");

    }
}


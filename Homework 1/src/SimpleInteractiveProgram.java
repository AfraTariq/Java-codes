import java.util.Scanner;

public class SimpleInteractiveProgram {
    public static void main(String[] args) {
        //Part A: Text Processing
        Scanner input = new Scanner(System.in);
        int spaces, k, start = 0, end = 0;
        String sentence = "", reversedWord = "", newSentence = "";
        //The program first asks the user to enter a sentence that:
        //• Contains at least six words, and
        //• Ends with an exclamation mark (!).
        System.out.print("Enter a sentence with at least 6 words and ending with '!': ");
        //while loop to check if the sentence entered is of the right
        //format, if not, the user is asked to enter another sentence with the
        //right format
        while (true) {
            spaces = 0; //the number of words are checked by counting the number of spaces in the sentence
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
        //Ask the user to enter a number k (k > 5).
        System.out.print("Enter k (k > 5) to reverse the k-th word: ");
        k = input.nextInt();
        //while loop to check if k>5, if not the user is asked to enter another value
        //for k which is k>5
        while (true) {
            if (k > 5) {
                spaces = 0;//spaces used to locate the kth word
                //find the start and end index of the word o be reversed in the sentence
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
                //Reverse the k-th word in the sentence.
                //
                for (int i = end; i >= start; i--)
                    reversedWord += sentence.charAt(i);
                //System.out.println(reversedWord); //to make sure the reversed word is right word before continuing

                newSentence = sentence.substring(end + 2);
                //System.out.println(newSentence);
                sentence = sentence.substring(0, start);
                sentence = sentence + reversedWord + newSentence;
                //System.out.println(sentence);
                newSentence = "";
                //Remove all spaces from the sentence.
                sentence = sentence.replace(" ", "");
                //Replace the exclamation mark (!) with the symbol $.
                sentence = sentence.replace("!", "$");
                //Change all lowercase letters to uppercase and all uppercase letters to lowercase.
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
                //Display the final result
                System.out.println("Modified message: " + newSentence);
                break;
            } else {//for if the entered k is less than or equal to 5
                System.out.println("Invalid value for k!");
                System.out.print("Enter k (k > 5) to reverse the k-th word: ");
                k = input.nextInt();
            }
        }
        //Part B: Mathematical Calculations
        char anotherCalc='y';
        int choice;
        double a,b;
        System.out.print("\n=== Part B: Math Calculations ===");
        while (anotherCalc == 'y') {// while loop displays the menu until the user does not want to do another calculation
            //Menu with all the options numbered
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Absolute value (abs)");
            System.out.println("6. Power (^)");
            System.out.println("7. Rounding (round to decimals)");
            System.out.println("0. Exit");
            //Ask the user to choose one operation from the menu.
            System.out.print("Your choice: ");
            choice = input.nextInt();
            //Ask for the required number of values for that operation
            // Perform the calculation and display the result depending on the option chosen.
            switch (choice){
                case 1:
                    System.out.print("Enter first number: ");
                    a=input.nextDouble();
                    System.out.print("Enter second number: ");
                    b=input.nextDouble();
                    System.out.println("Result = "+(a+b));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    a=input.nextDouble();
                    System.out.print("Enter second number: ");
                    b=input.nextDouble();
                    System.out.println("Result = "+(a-b));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    a=input.nextDouble();
                    System.out.print("Enter second number: ");
                    b=input.nextDouble();
                    System.out.println("Result = "+(a*b));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    a=input.nextDouble();
                    System.out.print("Enter second number: ");
                    b=input.nextDouble();
                    if(b==0)
                        System.out.println("Cannot divide by zero");
                    else
                        System.out.println("Result = "+(a/b));
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    a=input.nextDouble();
                    System.out.println("Result = "+ Math.abs(a));
                    break;
                case 6:
                    System.out.print("Enter the number base: ");
                    a=input.nextDouble();
                    System.out.print("Enter the power: ");
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
            //Asks the user if they want to perform another calculation, 'y'--> the loop continues; 'n' exits the loop
            System.out.print("\nDo you want to do another calculation? (y/n): ");
            anotherCalc=input.next().charAt(0);

        }
        System.out.print("Program ended.");

    }
}


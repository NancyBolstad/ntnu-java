/**
 *
 * A simple guessing game. It includes an input validation as well as a do while loop which controls how many attempts a user will get. 
 * 
 * This program has fixed answer values, i.e. not randomized. 
 * The answer values are the integer 5, the letter j (not case sensitive), and the word "Java" (not case sensitive).
 *
 * @author Nancy Bolstad
 * @version 1.0 06-09-2018
 *
 *
 */


import static javax.swing.JOptionPane.*;

public class GuessGame {

    public static void main(String[] args) {
        
        //Define the answers.
        final int originalNr = 5;
        final String originalAph = "J";
        final String originalWord = "Java";
        
        // Counting down the number of attempts, using a do-while loop. 
        int counter = 0;
        do {
            
            int attempt=counter+1;
            showMessageDialog(null, "A number, a letter, and a 4-letters-long word have been chosen.\nTry to find them within 3 attempts!\nThis is attempt " + attempt+ ".");
            
            //Validate user input.
            
            String inputNRString = showInputDialog("Enter a number");
            int inputNRResult = Integer.parseInt(inputNRString);
            if (inputNRResult == 5) {
                showMessageDialog(null, "You found the correct number!");
            } else {
                showMessageDialog(null, "The correct number should be 5.");
            }


            String inputAphString = showInputDialog("Enter a letter");
            boolean inputAph = inputAphString.equalsIgnoreCase(originalAph);
            int inputAhResult = inputAph ? 1 : 0;
            if (inputAhResult == 1) {
                showMessageDialog(null, "You found the correct letter.");
            } else {
                showMessageDialog(null, "The correct letter should be j.");
            }

            String inputWordString = showInputDialog("Enter a word composed of four letters");
            boolean inputWord = inputWordString.equalsIgnoreCase(originalWord);
            int inputWordResult = inputWord ? 1 : 0;
            if (inputWordResult == 1) {
                showMessageDialog(null, "You found the correct word.");
            } else {
                showMessageDialog(null, "The correct word should be Java.");
            }


            //When all the values have been found, the user will receive a congratulatory message and the program will be closed automatically. 
            
            if (inputNRResult == 5 && inputAhResult == 1 && inputWordResult == 1) {
                showMessageDialog(null, "Congrats! You solved all the puzzles! \n The number is 5, the letter is j, and the word is Java.");
                System.exit(1);
            }
        
            //If the user failed to find all three answers, one of the three attemps will be lost. Increase counter's value automatically after exexuting the validation codes.
            counter++;
            
            //After three attempts, the program will be closed.
            if(counter>2){
            showMessageDialog(null, "Out of the 3 attempts! Better luck next time!");
            System.exit(1);
            }
        }while (counter <=2);
    }
}

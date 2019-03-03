/*
 * A program counts the number of occurrences of a char in a given String. 
 * 
 * 
 * 
 * @Version 15-09-2018
 * 
 */ 

import static javax.swing.JOptionPane.*;

public class AntallTegn {

    public static void main(String[] args) {
        String typeSomewords = showInputDialog("Write something here:");
        String typeALetter = showInputDialog("Write a letter to here:");
        while (typeALetter.length() == 0) {
            typeALetter = showInputDialog("Write a letter to here:");
        }
        char letterToCheck = typeALetter.charAt(0);
        
        int inputLength = typeSomewords.length();
        int counter = 0;
        for (int i = 0; i < inputLength; i++) {
            if (letterToCheck == typeSomewords.charAt(i)) {
                counter++;
            }
        }
        
        /* This is just a personal note. 
         * JOptionPane.showConfirmDialog() returns an int value:
         * YES_OPTION => 0; NO_OPTION => 1; CLOSED_OPTION => -1;CANCEL_OPTION => 2
         */
        
        int wantToGuess = showConfirmDialog(null, "Do you want to guess how many times " + letterToCheck + " appeared in your input?");

        if (wantToGuess == 0) {
        
            boolean shouldContinue = true;
            while (shouldContinue) {
                String amountGuessTypein = showInputDialog("Type in the amount of times:");
                int userAnswer = Integer.parseInt(amountGuessTypein);

                if (userAnswer == counter) {
                    shouldContinue = false;
                }else {
                    int tryAgain = showConfirmDialog(null, "That's wrong! Do you want to try again?");
                    if (tryAgain == 0) {
                        shouldContinue = true;
                    }else{
                        showMessageDialog(null, "All right! " + typeALetter + " appeared " + counter + " times in " + '"' + typeSomewords + '"');
                    }
                }
            }
            showMessageDialog(null, "Correct! " + typeALetter + " appeared " + counter + " times in " + '"' + typeSomewords + '"');
        }else{
            showMessageDialog(null, "All right! " + typeALetter + " appeared " + counter + " times in " + '"' + typeSomewords + '"');
        }
    }
}
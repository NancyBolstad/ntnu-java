 

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
		int wantToGuess = showConfirmDialog(null, "Do you want to guess how many times " + letterToCheck + " appeared in your input?");

/* This is just a personal note.

   JOptionPane.showConfirmDialog() returns an int value:
	YES_OPTION => 0
	NO_OPTION => 1
	CLOSED_OPTION => -1
	CANCEL_OPTION => 2
*/

		if (wantToGuess == 0) {
/*
Simple note:

Tests the boolean variable shouldContinue to check if the while loop should be executed or not.

As long as the shouldContinue variable has the value true, the while loop body will continue to execute.
If the shouldContinue variable has the value false, the while loop stops, and execution picks up at the next statement after the while loop.
 */
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
						System.exit(1);
					}
				}
			}
			showMessageDialog(null, "Correct! " + typeALetter + " appeared " + counter + " times in " + '"' + typeSomewords + '"');
			System.exit(1);
		}
		else{
			showMessageDialog(null, "All right!" + typeALetter + " appeared " + counter + " times in " + '"' + typeSomewords + '"');
			System.exit(1);
		}
	}
}
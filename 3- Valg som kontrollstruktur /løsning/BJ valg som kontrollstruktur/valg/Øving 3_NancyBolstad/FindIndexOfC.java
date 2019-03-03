/*
 * A program that checks whether the user input has any c in it. 
 * If there is a c in the input, the index of the first instance of the letter c
 * will be printed.
 * 
 * Version 1 13-09-2018 Nancy Bolstad
 */ 

import static javax.swing.JOptionPane.*;

public class FindIndexOfC {

    public static void main(String[] args) {
	String input=showInputDialog("Type in something here:");
	String inputFormat=input.toLowerCase();
	int index=inputFormat.indexOf('c');

	String output;
	if (index>=0){
	    output="Index of the first 'c' in your input is: " + index;
    } else{
	    output="There is no 'c' in your input";
    }

    showMessageDialog(null,output);
    }
}

 /*
  * A program to identify whether or nor a given text is "enkel norsk."
  * 
  * Version 1.0 13-09-2018 Nancy Bolstad
  */

import static javax.swing.JOptionPane.*;

public class IsEnkelNorsk {

    public static void main(String[] args) {
	String text=showInputDialog("Type in text here: ");
	String textFormat=text.toLowerCase();

	int indexOfc= textFormat.indexOf('c');
	int indexOfq= textFormat.indexOf('q');
	int indexOfw= textFormat.indexOf('w');
	int indexOfx= textFormat.indexOf('x');
	int indexOfz= textFormat.indexOf('z');

	int indexOfae= textFormat.indexOf('æ');
	int indexOfaa= textFormat.indexOf('å');
	int indexOfoo= textFormat.indexOf('ø');

	boolean isEnkelNorsk= (indexOfc<0 && indexOfq<0 && indexOfw<0 && indexOfc<0 && indexOfz<0)&& ((indexOfae>=0 || indexOfaa>=0 || indexOfoo>=0));

	String output;
	if (isEnkelNorsk){
	    output="Your text is enkel norsk!";
    }else {
        output="Your text is not enkel norsk!";
	}

	showMessageDialog(null,output);
    }
}

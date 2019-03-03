/**
 *
 * A Java program that converts an amount of seconds into hour(s),minute(s) and second(s). 
 * 
 * The program includes a simple error/exception handling and a user-input validation. 
 * 
 * One bug remains to be fixed: The program can't handle the input of special characters, such as ! and ?. If a user inputs such characters, an error is thrown
 * (which is not caught by the NumberFormatException). With my limited experience with Java, I'm still unable to fix this. But I'm working on it... 
 * 
 * Any feedback or suggestions would be much appriciated. 
 * 
 * @author Nancy Bolstad
 * @version 1.0 06-09-2018
 *
 *
 */


import static javax.swing.JOptionPane.*;

public class SecondstoHoursMinsSecs {

    public static void main(String[] args) {
        String secTotalInput = showInputDialog("How many seconds do you want to be converted?");

        int numHour=0;
        try {
            numHour = Integer.parseInt(secTotalInput);

        } catch (NumberFormatException exc) {
            String messageLine = "Your input must be an integer.\nTry again next time! Bye!";

            showMessageDialog(null, messageLine, "Input Error", ERROR_MESSAGE);

            System.exit(1);
        }


        int secTotal = Integer.parseInt(secTotalInput);

        if (secTotal >= 0) {

            int hour=secTotal/3600;
            int min=(secTotal-(3600*hour))/60;
            int sec=secTotal-(3600*hour)-(60*min);

            String output = new String("Your input equals " + hour + " Hour(s) and " + min + " Minute(s) " + sec + " Second(s).");

            showMessageDialog(null, output);

        } else {
            showMessageDialog(null, "Invalid input.\nYour input cannot be negative.");
        }
    }
}
/**
 *
 * A Java program meant to convert hours, minutes and seconds into an amount of seconds, including a simple exception handling.
 *
 * @author Nancy Bolstad
 * @version 1.0 06-09-2018
 *
 *
 */

 

import static javax.swing.JOptionPane.*;

public class SekunderAntall {

    public static void main(String[] args) {

        String hourInput = showInputDialog("How many hours do you want to convert into seconds?");

        int numHour=0;
        try {
            numHour = Integer.parseInt(hourInput);

        } catch (NumberFormatException exc) {
            String messageLine1 = "Your input must be an integer.\n ";
            String messageLine2 = "Try again!";

            showMessageDialog(null, messageLine1 + messageLine2, "Input Error", ERROR_MESSAGE);

            hourInput = showInputDialog("How many hours do you want to convert into seconds?");
        }
        

        int hour = Integer.parseInt(hourInput);


        String minInput = showInputDialog("And how many minutes do you want to convert into seconds?");

        int numMin=0;
        try {
            numMin = Integer.parseInt(minInput);

        } catch (NumberFormatException exc) {
            String messageLine1 = "Your input must be an integer.\n ";
            String messageLine2 = "Try again!";

            showMessageDialog(null, messageLine1 + messageLine2, "Input Error", ERROR_MESSAGE);

            minInput = showInputDialog("And how many minutes do you want to convert into seconds?");
        }

        int min = Integer.parseInt(minInput);

        String secInput = showInputDialog("How many seconds do you want to include?");

        int numSec=0;
        try {
            numSec = Integer.parseInt(secInput);

        } catch (NumberFormatException exc) {
            String messageLine1 = "Your input must be an integer.\n ";
            String messageLine2 = "Try again!";

            showMessageDialog(null, messageLine1 + messageLine2, "Input Error", ERROR_MESSAGE);

            secInput = showInputDialog("How many seconds do you want to include?");
        }

        int sec = Integer.parseInt(secInput);


        if (hour >= 0 && min >= 0 && sec >= 0) {

                int result = hour * 3600 + min * 60 + sec;

                String output = new String("You get " + result + " seconds in total.");

                showMessageDialog(null, output);
            } else {
                showMessageDialog(null, "Invalid input.");
            }
        }
    }

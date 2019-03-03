/*
 * Program to check whether or nor a given year is a leap year.
 * 
 * vesrion 1.0
 * Nancy Bolstad
 * 
 * Result:
 * 2018 is not a leap year.
 * 2400 is a leap year.
 */ 

import static javax.swing.JOptionPane.*;
import java.util.regex.Pattern;

public class IsLeapYear {

    public static void main(String[] args) {
        String yearInput=showInputDialog("Type in a year: ");
        int year=Integer.parseInt(yearInput);

        String output;
        if ((year%4==0 && year%100!=0 )||year%400==0){
            output=year+" is a leap year";
        } else {
            output=year+" is not a leap year";
        }

    showMessageDialog(null,output);
    }
}

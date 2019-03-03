/*
 * Program for drawing pyramid patterns.
 * 
 * @version 15-09-2018 
 * 
 */ 

import static javax.swing.JOptionPane.*;
public class Pyramid {

    public static void main(String[] args) {
        String typeRows=showInputDialog("How many lines?");
        int rows=Integer.parseInt(typeRows);
        StringBuilder figure= new StringBuilder();
        String eachline="";
        for (int i = 0; i < rows; i++) {
            System.out.println(figure.append(eachline).append("*"));
        }
    }
}
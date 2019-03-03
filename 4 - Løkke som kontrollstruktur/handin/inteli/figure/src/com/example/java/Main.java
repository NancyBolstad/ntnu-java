package com.example.java;

public class Main {

    public static void main(String[] args) {
        StringBuilder figure= new StringBuilder();
        String eachline="";
        for (int i = 0; i < 5; i++) {
            System.out.println(figure.append(eachline).append("*"));
        }
    }
}
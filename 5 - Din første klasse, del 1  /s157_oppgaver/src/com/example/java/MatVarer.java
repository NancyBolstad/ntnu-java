package com.example.java;

public class MatVarer
{
    // instance variables - replace the example below with your own
    private final String matNavn;
    private final int energiInnhold;
    private final double fettInnhold;
    private final double karbohydraterInnhold;

    /**
     * Constructor for objects of class MatOgInnhold
     */
    public MatVarer(String matNavn, int energiInnhold, double fettInnhold,double karbohydraterInnhold)
    {
        // initialise instance variables
        this.matNavn=matNavn;
        this.energiInnhold=energiInnhold;
        this.fettInnhold=fettInnhold;
        this.karbohydraterInnhold=karbohydraterInnhold;

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getMatNavn()
    {
        // put your code here
        return matNavn;
    }
    public double finnEnergi(double gram){
        return energiInnhold*gram*0.01;
    }
    public double finnFett(double gram){
        return fettInnhold*gram*0.01;
    }
    public double finnKarbohydrater(double gram){
        return karbohydraterInnhold*gram*0.01;
    }
    public double finnKcal(double gram){
        return energiInnhold*gram*0.01*4.18;
    }
}
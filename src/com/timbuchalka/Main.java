package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        double feetInch = CalFeetandInchesToCm(-9, 11);
        double inch = CalFeetandInchesToCm(82);

        System.out.println(feetInch);
        System.out.println(inch);
    }
    public static double CalFeetandInchesToCm(int feet, int inches){
        if(feet < 0 || inches < 0 || inches >= 12){
            return -1;
        }


        return (feet * 12 * 2.54) + (inches * 2.54);
    }

    public static double CalFeetandInchesToCm(int inches){
        double result;

        if(inches < 0){
            return -1;
        }

        int feet = inches / 12;
        int remaininginches = inches % 12;

        return CalFeetandInchesToCm(feet, remaininginches);
    }
}

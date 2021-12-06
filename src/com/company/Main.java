package com.company;

import java.util.Scanner;

public class Main {

    public static void printNextLeapYears () {
        int i = 0;
        int year = inputYear();

        if (checkIfLeapYear(year)){
            System.out.println("It is a leap year");
            System.out.println("There are the next 20 leap years");
            while (i < 20) {
                System.out.println("Year #" + (i + 1) + " " + year);
                year += 4;
                i++;
            }
        } else {
            System.out.println("It is not a leap year");
        }
    }

    public static boolean checkIfLeapYear (int year) {
        /*boolean isLeapYear = false;
        if(year % 4 == 0) {
            isLeapYear = true;
        }
        return isLeapYear;*/

        return year % 4 == 0;
    }

    public static int inputYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a year: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        // Program that prints the next 20 leap years
        printNextLeapYears();

    }
}
package org.example;

import beans.ConversionDevice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("Welcome to the Conversion Device!");
            System.out.println("Choose from the options : ");
            System.out.println("1. Convert feet to inch ");
            System.out.println("2. Convert yard to feet ");
            System.out.println("3. Convert inch to yard ");
            System.out.println("4. Exit ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            ConversionDevice converter = new ConversionDevice();

            switch (choice) {
                case 1:
                    converter.convertFeetToInch();
                    break;
                case 2:
                    converter.convertYardToFeet();
                    break;
                case 3:
                    converter.convertInchToYard();
                    break;
                default:
                    System.out.println("Please enter (1-4) only ! ");
            }
        } while (choice != 4);

//        Convert 6 feet to how many inches
//
//        Convert 5 yards is equal to how many feet
//
//        Convert 5 inches is equal to how many yards



    }
}
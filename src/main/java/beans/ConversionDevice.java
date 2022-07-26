package beans;

import utils.ConversionFactor;

import java.util.Scanner;

public class ConversionDevice {
    Scanner sc = new Scanner(System.in);

    public void convertFeetToInch()
    {
        double feet, inch;
        System.out.println("Enter the number of feet : ");
        feet = sc.nextDouble();
        inch= ConversionFactor.FOOT_TO_INCH * feet;
        System.out.println("Your feet : " + feet + " to inch is : " + inch);

    }

    public void convertYardToFeet()
    {
        double yard, feet;
        System.out.println("Enter the number of yard : ");
        yard = sc.nextDouble();
        feet = ConversionFactor.YARD_TO_FOOT * yard;
        System.out.println("Your yard : " + yard + " to feet is : " + feet);
    }

    public void convertInchToYard()
    {
        double inch, yard;
        System.out.println("Enter the number of inch : ");
        inch = sc.nextDouble();
        yard = ConversionFactor.INCH_TO_YARD * inch;
        System.out.println("Your inch : " + inch + " to yard is : " + yard);
    }
}

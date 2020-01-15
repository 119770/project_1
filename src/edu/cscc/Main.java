package edu.cscc;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Program to take city name, zip, and temperature

        String city;
        int zip;
        float[] temp = new float[5];
        float avgTemp;

        System.out.println("Please enter the city: ");
        city = input.nextLine();
        System.out.println("Please enter the zip: ");
        zip = input.nextInt();
        System.out.println("Please enter the temperatures of 5 days pressing enter after each day: ");
        for (int i = 0; i < 5; i++) {
            temp[i] = input.nextFloat();
        }

        avgTemp = (temp[0] + temp[1] + temp[2] + temp[3] + temp[4]) / 5;

        System.out.println(" City: " + city + " Zip Code: " + zip + " Average High Temperature: " + avgTemp);

    }
}

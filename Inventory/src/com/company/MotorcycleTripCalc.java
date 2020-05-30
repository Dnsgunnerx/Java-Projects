package com.company;

import java.util.Scanner;

public class MotorcycleTripCalc {

    String[] harley = {};
    String[] Ducati = {};
    String[] BMW = {};
    String[] Honda = {};
    String[] Yamaha = {};
    String[] Suzuki = {};
    String[] KTM = {};





    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        MotorcycleTripCalc trip = new MotorcycleTripCalc();


        System.out.println("What bike are you riding today?");
        System.out.println("H-Harley Davidson");
        System.out.println("D-Ducati");
        System.out.println("B-BMW");
        System.out.println("H-Honda");
        System.out.println("Y-Yamaha");
        System.out.println("S-Suzuki");
        System.out.println("K-KTM");
        System.out.println(" ");

        String bike = userInput.nextLine();



    }
}

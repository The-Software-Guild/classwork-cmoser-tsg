package org.sg.windowmaster;

import java.util.Scanner;

public class WindowMaster {

    private static Scanner myScanner = new Scanner(System.in);


    public static void main(String[] args) {

        // Declare variables
        String familyName;
        String givenName;

        float height;
        float width;

        String stringHeight;
        String stringWidth;

        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        // comment

        // Get input
        // Instantiate

        familyName = retrieveFamilyName();
        System.out.println("Please enter the given name:");
        givenName = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();

        // Make calculatinos
        height = retrieveHeight();
        width = Float.parseFloat(stringWidth);

        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width);
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));

        double a = 3.5;
        float b = 3.5f;
        int c = 2;
        long d = 22222222222l;

        // Give information back to user
        System.out.println("Customer family name: " + familyName);
        System.out.println("Customer given name: " + givenName);
        System.out.println("Window height = " + height);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        printCost(cost);


    }

    private static String retrieveFamilyName() {
        System.out.println("Please enter the family name:");
        String name = myScanner.nextLine();
        return name;
    }

    private static float retrieveHeight() {
        System.out.println("Please enter window height:");
        String stringHeight = myScanner.nextLine();
        return Float.parseFloat(stringHeight);
    }

    private static void printCost(float cost) {
        System.out.println("Total Cost =  " + cost);
    }
}

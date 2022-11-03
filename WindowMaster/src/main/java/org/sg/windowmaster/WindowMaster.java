package org.sg.windowmaster;

import java.util.Scanner;

public class WindowMaster {

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

        // Get input
        // Instantiate
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter the family name:");
        familyName = myScanner.nextLine();
        System.out.println("Please enter the given name:");
        givenName = myScanner.nextLine();
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();

        // Make calculatinos
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);

        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width);
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));

        // Give information back to user
        System.out.println("Customer family name: " + familyName);
        System.out.println("Customer given name: " + givenName);
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost =  " + cost);


    }

}

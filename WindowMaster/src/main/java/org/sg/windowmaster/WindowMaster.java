package org.sg.windowmaster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WindowMaster {

    private static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Declare variables
        String familyName;
        String givenName;

        String stringHeight;
        String stringWidth;

        // Get input

//        familyName = retrieveFamilyName();
//        System.out.println("Please enter the given name:");
//        givenName = myScanner.nextLine();
//        System.out.println("Please enter window width:");
//        stringWidth = myScanner.nextLine();

        // Make calculatinos
        // Create an object of type Window
        // Instantiation
        RectangularWindow window1 = new RectangularWindow(1.5f, 2.4f);
        float cost = window1.getCost();

        RectangularWindow window2 = new RectangularWindow(5f, 4f);
        cost = window2.getCost();

        SquareWindow squareWindow = new SquareWindow(4.7f);
        cost = squareWindow.getCost();

        List<LineItemInterface> lineItems = new ArrayList<>();
        lineItems .add(window1);
        lineItems .add(window2);
        lineItems .add(squareWindow);

        //for (RectangularWindow window: windows) {
        for (LineItemInterface window: lineItems ) {
            System.out.println("Cost: " + window.getCost());
        }
        //List<String> test2 = new List<>();

        //Window test = new Window();

//        areaOfWindow = height * width;
//        perimeterOfWindow = 2 * (height + width);
//        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
//
//        // Give information back to user
//        System.out.println("Customer family name: " + familyName);
//        System.out.println("Customer given name: " + givenName);
//        System.out.println("Window height = " + height);
//        System.out.println("Window width = " + stringWidth);
//        System.out.println("Window area = " + areaOfWindow);
//        System.out.println("Window perimeter = " + perimeterOfWindow);
//        printCost(cost);


    }

    private static String retrieveFamilyName() {
        System.out.println("Please enter the family name:");
        String name = myScanner.nextLine();
        return name;
    }

    private static String retrieveGivenName() {
        System.out.println("Please enter the family name:");
        return myScanner.nextLine();
    }

    private static float retrieveHeight() {
        System.out.println("Please enter window height:");
        String stringHeight = myScanner.nextLine();
        return Float.parseFloat(stringHeight);
    }

    private static float retrieveWidth() {
        System.out.println("Please enter window height:");
        String stringHeight = myScanner.nextLine();
        return Float.parseFloat(stringHeight);
    }

    private static void printCost(float cost) {
        System.out.println("Total Cost =  " + cost);
    }
}

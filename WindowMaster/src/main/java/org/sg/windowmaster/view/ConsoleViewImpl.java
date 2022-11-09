package org.sg.windowmaster.view;

import org.sg.windowmaster.dto.LineItemInterface;
import org.sg.windowmaster.dto.RectangularWindow;

import java.util.Scanner;

public class ConsoleViewImpl implements ViewInterface {
    private Scanner myScanner = new Scanner(System.in);

    @Override
    public LineItemInterface addItem() {
        float height = retrieveHeight();
        float width = retrieveWidth();
        RectangularWindow window = new RectangularWindow(height, width);
        return window;
    }

    @Override
    public String retrieveFamilyName() {
        System.out.println("Please enter the family name:");
        String name = myScanner.nextLine();
        return name;
    }

    @Override
    public String retrieveGivenName() {
        System.out.println("Please enter the family name:");
        return myScanner.nextLine();
    }

    private float retrieveHeight() {
        System.out.println("Please enter window height:");
        String stringHeight = myScanner.nextLine();
        return Float.parseFloat(stringHeight);
    }

    private float retrieveWidth() {
        System.out.println("Please enter window height:");
        String stringHeight = myScanner.nextLine();
        return Float.parseFloat(stringHeight);
    }

    public void printCost(float cost) {
        System.out.println("Total Cost =  " + cost);
    }
}

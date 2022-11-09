package org.sg.windowmaster.controller;

import org.sg.windowmaster.dao.LineItemDao;
import org.sg.windowmaster.dto.LineItemInterface;
import org.sg.windowmaster.dto.RectangularWindow;
import org.sg.windowmaster.dto.SquareWindow;
import org.sg.windowmaster.view.ViewInterface;


public class WindowMasterController {
    ViewInterface view;

    public WindowMasterController(ViewInterface view) {
        this.view = view;
    }

    //public static void main(String[] args) {
    public void run() {

        // Declare variables
        String familyName;
        String givenName;

        // Get input

        familyName = view.retrieveFamilyName();
        givenName = view.retrieveGivenName();
        //float height = view.retrieveHeight();


        // Make calculatinos
        // Create an object of type Window
        // Instantiation
        RectangularWindow window1 = new RectangularWindow(1.5f, 2.4f);
        float cost = window1.getCost();

        RectangularWindow window2 = new RectangularWindow(5f, 4f);
        cost = window2.getCost();

        SquareWindow squareWindow = new SquareWindow(4.7f);
        cost = squareWindow.getCost();

        LineItemDao lineItems = new LineItemDao();
        lineItems.addItem(window1);
        lineItems.addItem(window2);
        lineItems.addItem(squareWindow);

        LineItemInterface item = view.addItem();
        lineItems.addItem(item);
        //lineItems.addItem(view.addItem());

        //for (RectangularWindow window: windows) {
        for (LineItemInterface window: lineItems.getItems()){
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


}

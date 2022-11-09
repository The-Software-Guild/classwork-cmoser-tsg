package org.sg.windowmaster;

import org.sg.windowmaster.controller.WindowMasterController;
import org.sg.windowmaster.view.BadExampleImpl;
import org.sg.windowmaster.view.ConsoleViewImpl;
import org.sg.windowmaster.view.ViewInterface;

public class App {

    public static void main(String[] args) {
        ViewInterface view = new ConsoleViewImpl();
        //BadExampleImpl view = new BadExampleImpl();
        // Dependency injection != loosely coupled
        WindowMasterController windowMasterController = new WindowMasterController(view);
        windowMasterController.run();
    }
}

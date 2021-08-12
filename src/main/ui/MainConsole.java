package ui;

import java.io.FileNotFoundException;

public class MainConsole {

    public static void main(String[] args) {
        try {
            new FoodManagerApp();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to run application: file not found");
        }
    }
}

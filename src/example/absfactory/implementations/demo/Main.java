package example.absfactory.implementations.demo;

import example.absfactory.implementations.client.Application;
import example.absfactory.implementations.factories.DarkThemeFactory;
import example.absfactory.implementations.factories.LightThemeFactory;
import example.absfactory.interfaces.IUIFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Started demo for abs factory");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Theme: Light or Dark");
        String theme = scanner.nextLine();
        IUIFactory factory;
        switch (theme){
            case "Light":
                factory = new LightThemeFactory();
                break;
            case "Dark":
                factory = new DarkThemeFactory();
                break;
            default:
                System.out.println("Defaulting to light theme");
                factory = new LightThemeFactory();
        }
        Application app = new Application(factory);
        app.render();
        app.interact();
    }
}

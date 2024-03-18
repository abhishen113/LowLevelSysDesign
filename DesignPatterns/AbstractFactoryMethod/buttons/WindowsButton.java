package DesignPatterns.AbstractFactoryMethod.buttons;

import DesignPatterns.AbstractFactoryMethod.buttons.Button;

public class WindowsButton implements Button {


    @Override
    public void paint() {
        System.out.println("You have created WindowsButton");
    }
}

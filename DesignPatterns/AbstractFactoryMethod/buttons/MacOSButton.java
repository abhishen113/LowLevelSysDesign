package DesignPatterns.AbstractFactoryMethod.buttons;

import DesignPatterns.AbstractFactoryMethod.buttons.Button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton");
    }
}

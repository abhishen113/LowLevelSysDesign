package DesignPatterns.CreationalPattern.AbstractFactoryMethod.buttons;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton");
    }
}

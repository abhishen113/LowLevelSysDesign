package DesignPatterns.AbstractFactoryMethod.app;

import DesignPatterns.AbstractFactoryMethod.buttons.Button;
import DesignPatterns.AbstractFactoryMethod.checkboxes.Checkbox;
import DesignPatterns.AbstractFactoryMethod.factories.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckBox();


    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}

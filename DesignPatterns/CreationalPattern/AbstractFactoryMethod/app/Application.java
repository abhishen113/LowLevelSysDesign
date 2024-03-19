package DesignPatterns.CreationalPattern.AbstractFactoryMethod.app;

import DesignPatterns.CreationalPattern.AbstractFactoryMethod.buttons.Button;
import DesignPatterns.CreationalPattern.AbstractFactoryMethod.checkboxes.Checkbox;
import DesignPatterns.CreationalPattern.AbstractFactoryMethod.factories.GUIFactory;

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

package DesignPatterns.CreationalPattern.AbstractFactoryMethod.factories;

import DesignPatterns.CreationalPattern.AbstractFactoryMethod.buttons.Button;
import DesignPatterns.CreationalPattern.AbstractFactoryMethod.buttons.MacOSButton;
import DesignPatterns.CreationalPattern.AbstractFactoryMethod.checkboxes.Checkbox;
import DesignPatterns.CreationalPattern.AbstractFactoryMethod.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacOSCheckbox();
    }
}

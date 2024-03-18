package DesignPatterns.AbstractFactoryMethod.factories;

import DesignPatterns.AbstractFactoryMethod.buttons.Button;
import DesignPatterns.AbstractFactoryMethod.buttons.MacOSButton;
import DesignPatterns.AbstractFactoryMethod.checkboxes.Checkbox;
import DesignPatterns.AbstractFactoryMethod.checkboxes.MacOSCheckbox;

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

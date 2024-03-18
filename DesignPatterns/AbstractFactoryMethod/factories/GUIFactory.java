package DesignPatterns.AbstractFactoryMethod.factories;

import DesignPatterns.AbstractFactoryMethod.buttons.Button;
import DesignPatterns.AbstractFactoryMethod.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckBox();
}

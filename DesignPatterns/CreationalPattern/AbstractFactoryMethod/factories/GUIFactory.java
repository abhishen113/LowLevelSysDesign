package DesignPatterns.CreationalPattern.AbstractFactoryMethod.factories;

import DesignPatterns.CreationalPattern.AbstractFactoryMethod.buttons.Button;
import DesignPatterns.CreationalPattern.AbstractFactoryMethod.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckBox();
}

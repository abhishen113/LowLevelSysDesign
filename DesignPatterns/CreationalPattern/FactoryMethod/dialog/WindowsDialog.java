package DesignPatterns.CreationalPattern.FactoryMethod.dialog;

import DesignPatterns.CreationalPattern.FactoryMethod.buttons.Button;
import DesignPatterns.CreationalPattern.FactoryMethod.buttons.windowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new windowsButton();
    }
}

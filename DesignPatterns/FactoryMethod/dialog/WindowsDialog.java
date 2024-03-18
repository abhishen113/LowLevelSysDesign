package DesignPatterns.FactoryMethod.dialog;

import DesignPatterns.FactoryMethod.buttons.Button;
import DesignPatterns.FactoryMethod.buttons.windowsButton;
import DesignPatterns.FactoryMethod.dialog.Dialog;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new windowsButton();
    }
}

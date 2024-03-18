package DesignPatterns.FactoryMethod.dialog;

import DesignPatterns.FactoryMethod.buttons.Button;
import DesignPatterns.FactoryMethod.buttons.HtmlButton;
import DesignPatterns.FactoryMethod.dialog.Dialog;

public class HtmlDialog extends Dialog {


    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

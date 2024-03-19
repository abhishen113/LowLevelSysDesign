package DesignPatterns.CreationalPattern.FactoryMethod.dialog;

import DesignPatterns.CreationalPattern.FactoryMethod.buttons.Button;
import DesignPatterns.CreationalPattern.FactoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {


    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

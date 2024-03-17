package DesignPatterns.FactoryMethod;

public class HtmlDialog extends Dialog{


    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

package DesignPatterns.FactoryMethod;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new windowsButton();
    }
}

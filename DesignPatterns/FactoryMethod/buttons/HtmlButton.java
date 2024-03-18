package DesignPatterns.FactoryMethod.buttons;


/*HTML button implementation

Concrete Product*/

import DesignPatterns.FactoryMethod.buttons.Button;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button> TEST BUTTON </button>");
        onClick();
    }

    @Override
    public void onClick() {

        System.out.println("Click! Button says - 'Hello World!'");

    }
}

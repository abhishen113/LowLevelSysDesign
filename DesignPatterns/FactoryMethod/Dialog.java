package DesignPatterns.FactoryMethod;
/*
Base factory class. Note that "factory" is merely a role for the class.
it should have some core business logic which needs different products to be
created.*/


public abstract class Dialog {




/*    subclasses will override this method in order to craete speicific windowsButton
    objects */

    public abstract Button createButton();


    public void renderWindow(){

        // other code
        Button okButton = createButton();
        okButton.render();
    }
}

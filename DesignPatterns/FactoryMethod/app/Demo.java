package DesignPatterns.FactoryMethod.app;

import DesignPatterns.FactoryMethod.dialog.Dialog;
import DesignPatterns.FactoryMethod.dialog.HtmlDialog;
import DesignPatterns.FactoryMethod.dialog.WindowsDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args){
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

    private static void configure() {

        if (System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
}

package DesignPatterns.CreationalPattern.FactoryMethod.app;

import DesignPatterns.CreationalPattern.FactoryMethod.dialog.Dialog;
import DesignPatterns.CreationalPattern.FactoryMethod.dialog.HtmlDialog;
import DesignPatterns.CreationalPattern.FactoryMethod.dialog.WindowsDialog;

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

package DesignPatterns.AbstractFactoryMethod.app;

import DesignPatterns.AbstractFactoryMethod.factories.GUIFactory;
import DesignPatterns.AbstractFactoryMethod.factories.MacOSFactory;
import DesignPatterns.AbstractFactoryMethod.factories.WindowsFactory;

public class Demo {

   private static Application configureApplication(){
       Application app;
       GUIFactory factory;

       String osName = System.getProperty("os.name").toLowerCase();

       if(osName.contains("mac")){
           factory = new MacOSFactory();
       }else {
           factory = new WindowsFactory();
       }

       app = new Application(factory);
       return app;

   }

   public static void main(String[] args){
       Application app = configureApplication();
       app.paint();
   }
}

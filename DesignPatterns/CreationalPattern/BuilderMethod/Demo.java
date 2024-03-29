package DesignPatterns.CreationalPattern.BuilderMethod;

import DesignPatterns.CreationalPattern.BuilderMethod.builders.CarBuilder;
import DesignPatterns.CreationalPattern.BuilderMethod.builders.CarManualBuilder;
import DesignPatterns.CreationalPattern.BuilderMethod.cars.Car;
import DesignPatterns.CreationalPattern.BuilderMethod.cars.Manual;

public class Demo {

    public static void main(String[] args){
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);


        Car car = builder.getResult();

        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();



        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\n Car manual built:\n" + carManual.print());




    }
}

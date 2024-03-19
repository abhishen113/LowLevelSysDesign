package DesignPatterns.CreationalPattern.BuilderMethod;

import DesignPatterns.CreationalPattern.BuilderMethod.builders.Builder;
import DesignPatterns.CreationalPattern.BuilderMethod.cars.CarType;
import DesignPatterns.CreationalPattern.BuilderMethod.components.Engine;
import DesignPatterns.CreationalPattern.BuilderMethod.components.GPSNavigator;
import DesignPatterns.CreationalPattern.BuilderMethod.components.Transmission;
import DesignPatterns.CreationalPattern.BuilderMethod.components.TripComputer;

public class Director {

    public void constructSportsCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0,0));
        builder.setTranmission(Transmission.SEMI_AUTOMATIC);
        builder.setGPSNavigator(new GPSNavigator());

    }

    public void contructCityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2 , 0));
        builder.setTranmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTranmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());

    }
}

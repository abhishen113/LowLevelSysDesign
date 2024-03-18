package DesignPatterns.BuilderMethod.builders;

import DesignPatterns.BuilderMethod.cars.Car;
import DesignPatterns.BuilderMethod.cars.CarType;
import DesignPatterns.BuilderMethod.cars.Manual;
import DesignPatterns.BuilderMethod.components.Engine;
import DesignPatterns.BuilderMethod.components.GPSNavigator;
import DesignPatterns.BuilderMethod.components.Transmission;
import DesignPatterns.BuilderMethod.components.TripComputer;

public class CarManualBuilder implements Builder{

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    @Override
    public void setCarType(CarType type) {
        this.type = type;

    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTranmission(Transmission tranmission) {
        this.transmission = tranmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult(){
        return new Manual( type, seats, engine, transmission, tripComputer ,gpsNavigator);
    }
}

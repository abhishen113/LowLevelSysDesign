package DesignPatterns.BuilderMethod.builders;

import DesignPatterns.BuilderMethod.cars.CarType;
import DesignPatterns.BuilderMethod.components.Engine;
import DesignPatterns.BuilderMethod.components.GPSNavigator;
import DesignPatterns.BuilderMethod.components.Transmission;
import DesignPatterns.BuilderMethod.components.TripComputer;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);

    void setEngine(Engine engine);
    void setTranmission(Transmission tranmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);

}

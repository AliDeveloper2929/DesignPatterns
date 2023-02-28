package refactoring_guru.builder.builders;
import refactoring_guru.builder.cars.CarType;
import refactoring_guru.builder.components.Engine;
import refactoring_guru.builder.components.GPSNavigator;
import refactoring_guru.builder.components.Transmission;
import refactoring_guru.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
    void setEngine(Engine engine);
}



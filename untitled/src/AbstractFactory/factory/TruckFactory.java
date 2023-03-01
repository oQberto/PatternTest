package AbstractFactory.factory;

import AbstractFactory.cars.Car;
import AbstractFactory.cars.Truck;
import AbstractFactory.enums.*;

import java.util.List;

public class TruckFactory implements Factory {
    @Override
    public Car createCar(CarBrand carBrand,
                                CarColor carColor,
                                CarEngine carEngine,
                                CarWheelSize carWheelSize,
                                List<CarOptions> carOptions) {
        return new Truck(carBrand, carColor, carEngine, carWheelSize, carOptions);
    }
}

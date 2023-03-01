package AbstractFactory.factory;

import AbstractFactory.cars.Car;
import AbstractFactory.enums.*;

import java.util.List;

public interface Factory {
    Car createCar(CarBrand carBrand,
                         CarColor carColor,
                         CarEngine carEngine,
                         CarWheelSize carWheelSize,
                         List<CarOptions> carOptions);
}

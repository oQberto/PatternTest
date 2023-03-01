package AbstractFactory.factory;

import AbstractFactory.cars.Car;
import AbstractFactory.cars.SpecialCar;
import AbstractFactory.enums.*;

import java.util.List;

public class SpecialCarFactory implements Factory {
    @Override
    public Car createCar(CarBrand carBrand,
                                CarColor carColor,
                                CarEngine carEngine,
                                CarWheelSize carWheelSize,
                                List<CarOptions> carOptions) {
        return new SpecialCar(carBrand, carColor, carEngine, carWheelSize, carOptions);
    }
}

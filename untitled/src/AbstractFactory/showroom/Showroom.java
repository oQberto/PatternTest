package AbstractFactory.showroom;

import AbstractFactory.cars.Car;
import AbstractFactory.enums.*;
import AbstractFactory.factory.Factory;

import java.util.List;

public class Showroom {
    private Car clientCar;

    public Showroom(String carType,
                    Factory factory,
                    CarBrand carBrand,
                    CarColor carColor,
                    CarEngine carEngine,
                    CarWheelSize carWheelSize,
                    List<CarOptions> carOptions) {
        if (carType.equalsIgnoreCase("SP")) {
            clientCar = factory.createCar(carBrand, carColor, carEngine, carWheelSize, carOptions);
        } else if (carType.equalsIgnoreCase("TRUCK")) {
            clientCar = factory.createCar(carBrand, carColor, carEngine, carWheelSize, carOptions);
        }
    }
}

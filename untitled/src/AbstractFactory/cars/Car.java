package AbstractFactory.cars;

import AbstractFactory.enums.*;

import java.util.List;

public interface Car {
    void build(CarBrand carBrand,
               CarColor carColor,
               CarEngine carEngine,
               CarWheelSize carWheelSize,
               List<CarOptions> carOptions);
}

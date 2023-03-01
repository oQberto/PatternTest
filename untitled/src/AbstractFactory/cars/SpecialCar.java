package AbstractFactory.cars;

import AbstractFactory.enums.*;

import java.util.ArrayList;
import java.util.List;

public class SpecialCar implements Car {
    private CarBrand carBrand;
    private CarColor carColor;
    private CarEngine carEngine;
    private CarWheelSize carWheelSize;
    private List<CarOptions> carOptions;

    public SpecialCar(CarBrand carBrand,
                      CarColor carColor,
                      CarEngine carEngine,
                      CarWheelSize carWheelSize,
                      List<CarOptions> carOptions) {
        build(carBrand,
                carColor,
                carEngine,
                carWheelSize,
                carOptions);
        System.out.println("Constructor");
    }
    @Override
    public void build(CarBrand carBrand,
                      CarColor carColor,
                      CarEngine carEngine,
                      CarWheelSize carWheelSize,
                      List<CarOptions> carOptions) {
        System.out.println("method build()");
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carEngine = carEngine;
        this.carWheelSize = carWheelSize;
        this.carOptions = carOptions == null ? new ArrayList<>() : carOptions;
    }
}

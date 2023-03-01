package AbstractFactory.cars;

import AbstractFactory.enums.*;

import java.util.ArrayList;
import java.util.List;

public class Truck implements Car {
    private CarBrand carBrand;
    private CarColor carColor;
    private CarEngine carEngine;
    private CarWheelSize carWheelSize;
    private List<CarOptions> carOptions;

    public Truck(CarBrand carBrand,
                      CarColor carColor,
                      CarEngine carEngine,
                      CarWheelSize carWheelSize,
                      List<CarOptions> carOptions) {
        build(carBrand,
                carColor,
                carEngine,
                carWheelSize,
                carOptions);
        System.out.println("truck Constructor");
    }
    @Override
    public void build(CarBrand carBrand,
                      CarColor carColor,
                      CarEngine carEngine,
                      CarWheelSize carWheelSize,
                      List<CarOptions> carOptions) {
        System.out.println("truck method build()");
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carEngine = carEngine;
        this.carWheelSize = carWheelSize;
        this.carOptions = carOptions == null ? new ArrayList<>() : carOptions;
    }
}

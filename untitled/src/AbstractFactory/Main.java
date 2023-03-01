package AbstractFactory;

import AbstractFactory.enums.*;
import AbstractFactory.factory.*;
import AbstractFactory.showroom.Showroom;

import java.util.Scanner;

public class Main {
    public static Showroom configShowroom() {
        Showroom showroom;
        Factory factory = null;
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        if (in.equalsIgnoreCase("SP")) {
            factory = new SpecialCarFactory();
        } else if (in.equalsIgnoreCase("TRUCK")){
            factory = new TruckFactory();
        }
        showroom = new Showroom("truck", factory, CarBrand.AUDI, CarColor.BLACK, CarEngine.ENGINE_1, CarWheelSize.BIG, null);
        return showroom;
    }

    public static void main(String[] args) {
        Showroom showroom = configShowroom();
    }
}

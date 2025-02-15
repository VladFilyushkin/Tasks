package com.taxi;

import com.taxi.model.Car;
import com.taxi.model.CarBrand;
import com.taxi.model.CarPark;
import com.taxi.model.CarType;
import com.taxi.model.PassengerCar;
import com.taxi.service.CarParkService;
import java.util.List;


public class Main {

  public static void main(String[] args) {
    Car bmw = new PassengerCar(CarBrand.BMW, "5 series", "Blue", 2003, 20, CarType.SEDAN, 80, 4000);
    Car audi = new PassengerCar(CarBrand.AUDI, "A5", "Black", 2005, 30, CarType.SEDAN, 4, 4576343);
    Car mercedes = new PassengerCar(CarBrand.MERCEDES, "C class", "White", 2003, 202, CarType.SEDAN,
        23521, 69999);
    Car volkswagen = new PassengerCar(CarBrand.VOLKSWAGEN, "Passat", "Yellow", 2003, 1,
        CarType.SEDAN, 8022, 34534);

    CarPark carPark = new CarPark(List.of(bmw, audi, mercedes, volkswagen));
    CarParkService carParkService = new CarParkService();
    List<Car> sortedCarsByFuelConsumption = carParkService.getSortedCarsByFuelConsumption(carPark);

    System.out.println(sortedCarsByFuelConsumption);
    System.out.println(carParkService.getPrice(carPark));
    System.out.println(carParkService.getSortedCarsByMaxSpeed(carPark, 2, 91));


  }
}

package com.taxi.service;

import com.taxi.model.Car;
import com.taxi.model.CarPark;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarParkService {

  public int getPrice(CarPark carPark) {
    int allCarPrice = 0;
    for (Car car : carPark.getCars()) {
      allCarPrice += car.getPrice();
    }
    return allCarPrice;
  }

  public List<Car> getSortedCarsByFuelConsumption(CarPark carPark) {
    List<Car> sortedCarsByFuelConsumption = new ArrayList<>(carPark.getCars());
    sortedCarsByFuelConsumption.sort(Comparator.comparing(Car::getFuelConsumption));
    return sortedCarsByFuelConsumption;
  }

  public List<Car> getSortedCarsByMaxSpeed(CarPark carPark, int firstSpeed, int secondSpeed) {
    List<Car> sortedCarsByMaxSpeed = new ArrayList<>();
    for (Car car : carPark.getCars()) {
      if (car.getMaxSpeed() >= firstSpeed && car.getMaxSpeed() <= secondSpeed) {
        sortedCarsByMaxSpeed.add(car);
      }
    }
    return sortedCarsByMaxSpeed;
  }

}

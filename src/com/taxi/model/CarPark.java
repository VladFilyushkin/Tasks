package com.taxi.model;

import java.util.List;

public class CarPark {

  private final List<Car> cars;

  public CarPark(List<Car> cars) {
    this.cars = cars;
  }

  public List<Car> getCars() {
    return cars;
  }

  @Override
  public String toString() {
    return "Carpark: " +
        cars.toString();
  }


}

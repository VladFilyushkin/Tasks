package com.taxi.model;
//Определить иерархию легоквых автомобилей. Создать автопарк. Посчитать стоимость автопарка. Провести сортировку
//автомобилей парка по расходу топлива. Найти автомобиль в компании, соответсвующий заданному диапазону параметров
//скорости

// В CarPark оставить только код для хранения данных и сделать отдельный сервис класс, где будет бизнес логика

public abstract class Car {

  private String model;
  private CarBrand brand;
  private String color;
  private int year;
  private int fuelConsumption;
  private CarType type;
  private int maxSpeed;
  private int price;

  public Car(CarBrand carBrand, String carModel, String carColor, int year, int fuelConsumption,
      CarType type, int speed, int price) {
    this.maxSpeed = speed;
    this.brand = carBrand;
    this.model = carModel;
    this.color = carColor;
    this.year = year;
    this.fuelConsumption = fuelConsumption;
    this.type = type;
    this.price = price;
  }

  public int getPrice() {
    return price;
  }


  public int getMaxSpeed() {
    return maxSpeed;
  }


  public CarBrand getBrand() {
    return brand;
  }


  public String getModel() {
    return model;
  }


  public String getColor() {
    return color;
  }


  public int getYear() {
    return year;
  }


  public int getFuelConsumption() {
    return fuelConsumption;
  }


  public CarType getType() {
    return type;
  }


  @Override
  public String toString() {
    return "Car brand " + brand +
        ", Car model " + model +
        ", Car color " + color +
        ", Car production year " + year +
        ", Average fuel consumption " + fuelConsumption +
        ", Car body type" + type +
        ", Maximum speed " + maxSpeed;
  }


}

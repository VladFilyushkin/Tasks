package Taxi_company.Cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarPark {
    private final List<Car> cars;

    public CarPark(List<Car> cars) {
        this.cars = cars;
    }

    public int getPrice() {
        int allCarPrice = 0;
        for (Car car : cars) {
            allCarPrice += car.getPrice();
        }
        return allCarPrice;
    }

    public List<Car> getSortedCarsByFuelConsumption() {
        List<Car> sortedCarsByFuelConsumption = new ArrayList<>(cars);
        sortedCarsByFuelConsumption.sort(Comparator.comparing(Car::getFuelConsumption));
        return sortedCarsByFuelConsumption;
    }

    public List<Car> getSortedCarsByMaxSpeed(int firstSpeed, int secondSpeed) {
        List<Car> sortedCarsByMaxSpeed = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= firstSpeed && car.getMaxSpeed() <= secondSpeed) {
                sortedCarsByMaxSpeed.add(car);
            }
        }
        return sortedCarsByMaxSpeed;
    }


    @Override
    public String toString() {
        return "Автопарк состоит из: " +
                cars.toString();
    }


}

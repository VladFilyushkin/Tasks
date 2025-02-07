package Taxi_company;
import Taxi_company.Cars.*;
import java.util.List;
//Определить иерархию легоквых автомобилей. Создать автопарк. Посчитать стоимость автопарка. Провести сортировку
//автомобилей парка по расходу топлива. Найти автомобиль в компании, соответсвующий заданному диапазону параметров
//скорости


public class Main {
    public static void main(String[] args) {
        Car bmw = new PassengerCar(CarBrand.BMW, "5 series", "Blue", 2003, 20, CarType.SEDAN, 80, 4000);
        Car audi = new PassengerCar(CarBrand.AUDI, "A5", "Black", 2005, 30, CarType.SEDAN, 4, 4576343);
        Car mercedes = new PassengerCar(CarBrand.MERCEDES, "C class", "White", 2003, 202, CarType.SEDAN, 23521, 69999);
        Car volkswagen = new PassengerCar(CarBrand.VOLKSWAGEN, "Passat", "Yellow", 2003, 1, CarType.SEDAN, 8022, 34534);

        CarPark carPark = new CarPark(List.of(bmw, audi, mercedes, volkswagen));
        List<Car> sortedCarsByFuelConsumption = carPark.getSortedCarsByFuelConsumption();

        System.out.println(sortedCarsByFuelConsumption);
        System.out.println(carPark.getPrice());
        System.out.println(carPark.getSortedCarsByMaxSpeed(2,91));


    }
}

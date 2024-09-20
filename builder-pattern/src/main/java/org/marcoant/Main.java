package org.marcoant;

import org.marcoant.builders.CarBuilder;
import org.marcoant.builders.TruckBuilder;
import org.marcoant.cars.Car;
import org.marcoant.cars.Truck;
import org.marcoant.director.Director;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();
    CarBuilder carBuilder = new CarBuilder();
    director.constructSedanCar(carBuilder);

    Car car = carBuilder.getResult();
    System.out.println(car.getCarType() + " produzido com sucesso");

    TruckBuilder truckBuilder = new TruckBuilder();
    director.constructTruck(truckBuilder);

    Truck truck = truckBuilder.getResult();
    System.out.println("Caminhão: " + truck.result());
  }
}
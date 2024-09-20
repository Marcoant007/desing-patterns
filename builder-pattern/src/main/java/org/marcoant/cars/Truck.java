package org.marcoant.cars;

import org.marcoant.components.CarType;
import org.marcoant.components.Engine;
import org.marcoant.components.Transmission;

public class Truck {
  private final CarType carType;
  private final int seats;
  private final Engine engine;
  private final Transmission transmission;

  public Truck(CarType carType, int seats, Engine engine, Transmission transmission) {
    this.carType = carType;
    this.seats = seats;
    this.engine = engine;
    this.transmission = transmission;
  }

  public  String result() {
    String truck = "Truck with motor: " + engine.getPower() + "\n";
    truck += " Transmition: " + transmission;
    return  truck;
  }
}

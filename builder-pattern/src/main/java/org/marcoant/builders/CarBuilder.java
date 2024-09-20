package org.marcoant.builders;

import org.marcoant.builders.ports.IBuilder;
import org.marcoant.cars.Car;
import org.marcoant.components.CarType;
import org.marcoant.components.Engine;
import org.marcoant.components.Transmission;

public class CarBuilder implements IBuilder {
  private CarType carType;
  private int seats;
  private Transmission transmission;
  private Engine engine;

  @Override
  public void setCarType(CarType type) {
    this.carType = type;
  }

  @Override
  public void setSeats(int seats) {
    this.seats = seats;
  }

  @Override
  public void setTransmission(Transmission transmission) {
    this.transmission = transmission;
  }

  @Override
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public Car getResult() {
    return new Car(carType, seats, engine, transmission);
  }
}

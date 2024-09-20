package org.marcoant.builders;

import org.marcoant.builders.ports.IBuilder;
import org.marcoant.cars.Truck;
import org.marcoant.components.CarType;
import org.marcoant.components.Engine;
import org.marcoant.components.Transmission;

public class TruckBuilder implements IBuilder {
  private CarType carType;
  private int seats;
  private Transmission transmission;
  private Engine engine;

  @Override
  public void setCarType(CarType type) {
    this.carType = carType;
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

  public Truck getResult() {
    return new Truck(carType, seats, engine, transmission);
  }
}

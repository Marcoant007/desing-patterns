package org.marcoant.director;

import org.marcoant.builders.ports.IBuilder;
import org.marcoant.components.CarType;
import org.marcoant.components.Engine;
import org.marcoant.components.Transmission;

public class Director {

  public void constructSedanCar(IBuilder builder) {
    builder.setCarType(CarType.SEDAN);
    builder.setSeats(5);
    builder.setTransmission(Transmission.AUTOMATIC);
    builder.setEngine(new Engine(1600));
  }

  public void constructTruck(IBuilder builder) {
    builder.setCarType(CarType.TRUCK);
    builder.setSeats(5);
    builder.setTransmission(Transmission.AUTOMATIC);
    builder.setEngine(new Engine(13000));
  }
}

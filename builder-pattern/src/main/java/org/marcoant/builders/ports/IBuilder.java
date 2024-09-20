package org.marcoant.builders.ports;

import org.marcoant.components.CarType;
import org.marcoant.components.Engine;
import org.marcoant.components.Transmission;

public interface IBuilder {

  void setCarType(CarType type);

  void setSeats(int seats);

  void setTransmission(Transmission transmission);

  void setEngine(Engine engine);
}

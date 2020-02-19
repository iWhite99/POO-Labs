package storage;

import dataprocessing.StepCountStrategy;
import dataprocessing.StepCountStrategyFactory;

import java.util.Observable;

public class DataAggregator implements java.util.Observer {
  StepCountStrategy stepCountStrategy;

  public DataAggregator(String stepCountStrategy) {
    this.stepCountStrategy = StepCountStrategyFactory.getStepCountStrategy(stepCountStrategy);
  }

  @Override
  public void update(Observable observable, Object o) {
    this.stepCountStrategy.apply((SensorData) o, ((DataRepository) observable).getSensorData());
    System.out.println("steps: " + this.stepCountStrategy.getTotalSteps());
  }
}

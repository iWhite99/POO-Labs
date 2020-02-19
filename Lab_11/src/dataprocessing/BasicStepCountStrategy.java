package dataprocessing;

import storage.SensorData;

import java.util.List;

public class BasicStepCountStrategy implements StepCountStrategy {
  private int stepsCount = 0;

  @Override
  public int getTotalSteps() {
    return stepsCount;
  }

  @Override
  public String getStrategyDescription() {
    return null;
  }

  @Override
  public void apply(SensorData sensorData, List<SensorData> list) {
    this.stepsCount += sensorData.getStepsCount();
  }
}

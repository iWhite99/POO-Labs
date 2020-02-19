package dataprocessing;

import main.Utils;
import storage.SensorData;

import java.util.List;

import static java.lang.Math.abs;

public class FilteredStepCountStrategy implements StepCountStrategy {
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
    int currentStepsCount = sensorData.getStepsCount();
    long timeStamp = sensorData.getTimestamp();
    if (currentStepsCount < 0) {
      return;
    }
    if (list.size() > 1) {
      if (abs(list.get(list.size() - 2).getTimestamp() - timeStamp) < Utils.TIME_FOR_MAX_DIFF
              && currentStepsCount > Utils.MAX_DIFF_STEPS_CONSECUTIVE_RECORDS) {
        return;
      }
    }
    this.stepsCount += currentStepsCount;
  }
}

package dataprocessing;

import main.Utils;

public class StepCountStrategyFactory {
  public static StepCountStrategy getStepCountStrategy(String strategy) {
    if (strategy.equals(Utils.BASIC_STRATEGY)) {
      return new BasicStepCountStrategy();
    } else if (strategy.equals(Utils.FILTERED_STRATEGY)) {
      return new FilteredStepCountStrategy();
    } else {
      return null;
    }
  }
}

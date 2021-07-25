package com.kuma.design_patterns.observer.case2;

import java.util.ArrayList;
import java.util.List;

public class ThreeDaysAverageReporter implements Reporter {
  private List<Integer> history = new ArrayList<>();

  public double getThreeDaysAverage() {

    return history.stream().mapToInt(e -> e).average().orElse(0);
  }

  @Override
  public void addQuantity(int quantity) {
    history.add(quantity);
    if (history.size() > 3) {
      history.remove(0);
    }
  }
}

package com.kuma.design_patterns.observer.case2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RainfallTest {

  public Rainfall rainfall;

  @Test
  void record_quantity() {

    LatestReporter latestReporter = new LatestReporter();
    ThreeDaysAverageReporter threeDaysAverageReporter = new ThreeDaysAverageReporter();

    rainfall = new Rainfall();

    rainfall.addReporter(latestReporter);
    rainfall.addReporter(threeDaysAverageReporter);

    addQuantities(0, 0, 0, 30);

    assertEquals(30, latestReporter.getLatest());

    assertEquals(10D, threeDaysAverageReporter.getThreeDaysAverage());
  }

  private void addQuantities(int... quantities) {

    for (int quantity : quantities) {
      rainfall.addQuantity(quantity);
    }
  }
}

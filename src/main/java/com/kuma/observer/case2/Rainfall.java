package com.kuma.observer.case2;

import java.util.ArrayList;
import java.util.List;

public class Rainfall {

  private List<Reporter> reporters = new ArrayList<>();



  public void addQuantity(int quantity) {

    for (Reporter reporter : reporters) {

      reporter.addQuantity(quantity);
    }
  }

  public void addReporter(Reporter reporter) {
    this.reporters.add(reporter);
  }
}

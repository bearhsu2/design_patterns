package com.kuma.observer.case2;

public class LatestReporter implements Reporter {

  private int latest;

  public int getLatest() {
    return this.latest;
  }

  @Override
  public void addQuantity(int quantity) {
    this.latest = quantity;
  }
}

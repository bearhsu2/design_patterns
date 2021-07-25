package com.kuma.design_patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainBoardTest {
  @Test
  public void same_instance() {

    MainBoard instance1 = MainBoard.getInstance();

    MainBoard instance2 = MainBoard.getInstance();



    assertTrue(instance1 != null);
    assertTrue(instance1 == instance2);
  }
}

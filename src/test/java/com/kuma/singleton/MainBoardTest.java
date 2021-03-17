package com.kuma.singleton;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainBoardTest {
  @Test
  public void same_instance() {

    MainBoard instance1 = MainBoard.getInstance();

    MainBoard instance2 = MainBoard.getInstance();



    assertTrue(instance1 != null);
    assertTrue(instance1 == instance2);
  }
}
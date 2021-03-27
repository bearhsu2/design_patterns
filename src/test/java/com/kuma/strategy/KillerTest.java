package com.kuma.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KillerTest {

  public Killer killer;

  @Test
  public void gun() {

    create_killer();

    kill_and_check_return_value("gun", "Killed with gun.");
  }

  private void create_killer() {
    killer = new Killer();
  }

  private void kill_and_check_return_value(String method, String expected) {
    String actual = killer.kill(method);

    assertEquals(actual, expected);
  }

  @Test
  public void knife() {

    create_killer();

    kill_and_check_return_value("knife", "Killed with knife.");
  }
}

package com.kuma.proxy;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GetUserAgeServiceTest {

  @Test
  public void normal_case() {

    UserRepository realRepository = Mockito.mock(UserRepository.class);
    Mockito.when(realRepository.getUser("Kuma")).thenReturn(null).thenReturn(new User(40));

    UserRepository proxy = new UserRepositoryProxy(realRepository);

    GetUserAgeService service = new GetUserAgeService(proxy);

    assertEquals(-1, service.execute("Kuma"));
    assertEquals(40, service.execute("Kuma"));
  }
}

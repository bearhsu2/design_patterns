package com.kuma.design_patterns.proxy;

public class UserRepositoryProxy extends UserRepository {
  private UserRepository realUserRepository;

  public UserRepositoryProxy(UserRepository realUserRepository) {
    this.realUserRepository = realUserRepository;
  }

  @Override
  public User getUser(String name) {

    User real = realUserRepository.getUser(name);

    if (real == null) {
      return new User(-1);
    }

    return real;
  }
}

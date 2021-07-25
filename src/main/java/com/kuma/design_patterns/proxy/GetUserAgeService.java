package com.kuma.design_patterns.proxy;

public class GetUserAgeService {

  private UserRepository userRepository;

  public GetUserAgeService(UserRepository userRepository) {

    this.userRepository = userRepository;
  }

  public UserRepository getUserRepository() {
    return userRepository;
  }

  public void setUserRepository(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public int execute(String name) {

    return this.userRepository.getUser(name).getAge();
  }
}

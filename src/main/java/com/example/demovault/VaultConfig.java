package com.example.demovault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties("demo") // set prefix for all properties
public class VaultConfig {

  private String test_key;

  private Map<String, String> users;

  @Value("${customKey}")
  private String anotherOne;

  public String getTest_key() {
    return test_key;
  }

  public void setTest_key(String test_key) {
    this.test_key = test_key;
  }

  public Map<String, String> getUsers() {
    return users;
  }

  public void setUsers(Map<String, String> users) {
    this.users = users;
  }

  public String getAnotherOne() {
    return anotherOne;
  }

  public void setAnotherOne(String anotherOne) {
    this.anotherOne = anotherOne;
  }
}

package com.example.demovault;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @Autowired
  private VaultConfig vaultConfig;

  @RequestMapping("/")
  public VaultConfig home() {
    return vaultConfig;
  }

}
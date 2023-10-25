package com.mirke.mediamicroservice.Security.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

  @Id
  @Column(name = "username", length = 50, nullable = false)
  private String username;

  @Column(name = "password", length = 50, nullable = false)
  private String password;

  @Column(name = "enabled", nullable = false)
  private boolean active;

  public User() {
  }

  public User(String username, String password, boolean active) {
    this.username = username;
    this.password = password;
    this.active = active;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }
}
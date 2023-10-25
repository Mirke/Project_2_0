package com.lad666.albummicroservice.Security.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "authorities")
public class Authority {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int role_ID;

  @ManyToOne
  @JoinColumn(name = "username")
  private User users;

  @Column(name = "authority", length = 50, nullable = false)
  private String authority;

  public Authority() {
  }

  public Authority(int role_ID, User users, String authority) {
    this.role_ID = role_ID;
    this.users = users;
    this.authority = authority;
  }

  public int getRole_ID() {
    return role_ID;
  }

  public void setRole_ID(int role_ID) {
    this.role_ID = role_ID;
  }

  public User getUsers() {
    return users;
  }

  public void setUsers(User users) {
    this.users = users;
  }

  public String getAuthority() {
    return authority;
  }

  public void setAuthority(String authority) {
    this.authority = authority;
  }
}

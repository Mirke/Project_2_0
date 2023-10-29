package moses.zal.SecurityMicroService.Security.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "authorities")
public class Authority {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int role_ID;

  @ManyToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name = "username")
  private User user;

  @Column(name = "authority", length = 50, nullable = false)
  private String authority;

  public Authority() {
  }

  public Authority(int role_ID, User user, String authority) {
    this.role_ID = role_ID;
    this.user = user;
    this.authority = authority;
  }

  public int getRole_ID() {
    return role_ID;
  }

  public void setRole_ID(int role_ID) {
    this.role_ID = role_ID;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User users) {
    this.user = users;
  }

  public String getAuthority() {
    return authority;
  }

  public void setAuthority(String authority) {
    this.authority = authority;
  }
}

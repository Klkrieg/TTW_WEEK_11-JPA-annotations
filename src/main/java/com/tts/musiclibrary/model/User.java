package com.tts.musiclibrary.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String firstName;
  private String lastName;
  private String userName;
  private Boolean isAdmin;

  @CreationTimestamp
  private Date createdOn;

  public User() {}

  public User(String firstName, String lastName, String userName, Boolean isAdmin) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.isAdmin = isAdmin;
  }

  public Long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Boolean getAdmin() {
    return isAdmin;
  }

  public void setAdmin(Boolean admin) {
    isAdmin = admin;
  }

  public Date getCreatedOn() {
    return createdOn;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", userName='" + userName + '\'' +
            ", isAdmin=" + isAdmin +
            ", createdOn=" + createdOn +
            '}';
  }
}

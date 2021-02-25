package com.tts.musiclibrary.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Album {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Column(name = "albumName")
  private String albumName;
  @Column(name = "artist")
  private String artist;
  @Column(name = "yearReleased")
  private String yearReleased;


  @CreationTimestamp
  private Date createdOn;

  public Album() {
  }

  public Album(String albumName, String artist, String yearReleased) {
    this.albumName = albumName;
    this.artist = artist;
    this.yearReleased = yearReleased;

  }

  public Long getId() {
    return id;
  }

  public String getAlbumName() {
    return albumName;
  }

  public void setAlbumName(String albumName) {
    this.albumName = albumName;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getYearReleased() {
    return yearReleased;
  }

  public void setYearReleased(String yearReleased) {
    this.yearReleased = yearReleased;
  }

  public Date getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Date createdOn) {
    this.createdOn = createdOn;
  }

  @Override
  public String toString() {
    return "Album{" +
            "id=" + id +
            ", albumName='" + albumName + '\'' +
            ", artist='" + artist + '\'' +
            ", yearReleased=" + yearReleased +
            '}';
  }
}

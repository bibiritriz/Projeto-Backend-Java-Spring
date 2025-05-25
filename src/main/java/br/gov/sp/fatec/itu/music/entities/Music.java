package br.gov.sp.fatec.itu.music.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class Music implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @ElementCollection
  @CollectionTable(name = "music_artists", joinColumns = @JoinColumn(name = "music_id"))
  @Column(name = "artist")
  private List<String> artists;

  private String album;
  @ElementCollection
  @CollectionTable(name = "music_genres", joinColumns = @JoinColumn(name = "music_id"))
  @Column(name = "genre")
  private List<String> genre;

  private int lenght;

  @ElementCollection
  @CollectionTable(name = "music_song_writers", joinColumns = @JoinColumn(name = "music_id"))
  @Column(name = "song_writer")
  private List<String> songWriters;

  @ElementCollection
  @CollectionTable(name = "music_producers", joinColumns = @JoinColumn(name = "music_id"))
  @Column(name = "producer")
  private List<String> producers;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getArtist() {
    return artists;
  }

  public void setArtist(List<String> artists) {
    this.artists = artists;
  }

  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public List<String> getGenre() {
    return genre;
  }

  public void setGenre(List<String> genre) {
    this.genre = genre;
  }

  public int getLenght() {
    return lenght;
  }

  public void setLenght(int lenght) {
    this.lenght = lenght;
  }

  public List<String> getSongWriters() {
    return songWriters;
  }

  public void setSongWriters(List<String> songWriters) {
    this.songWriters = songWriters;
  }

  public List<String> getProducers() {
    return producers;
  }

  public void setProducers(List<String> producers) {
    this.producers = producers;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Music other = (Music) obj;
    return Objects.equals(id, other.id);
  }
}

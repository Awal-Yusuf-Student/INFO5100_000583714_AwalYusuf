package model;

import java.util.Date;

public class Musician {
  int id;
  String name;
  String musicname;
  Date dob;
  String instruments[];
  String genre;
  String albums[];
  enum Type{Composer, Songwriter, Conductor, Performer};
  int awards;
  

  public Musician() {
		this.id = (int) (Math.random() * 100);
		System.out.println("Registering new Musician with id: " + this.id);
	}

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMusicname() {
    return this.musicname;
  }

  public void setMusicname(String musicname) {
    this.musicname = musicname;
  }

  public Date getDob() {
    return this.dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }


}

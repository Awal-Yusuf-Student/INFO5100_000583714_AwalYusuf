package model;

public class Animal {
  int animalid;
  String species;
  String zoologyname;
  int lifespan;
  int weight;
  enum behavior{Friendly, Wild, Shy};
  boolean petable;
  String comment;

  public Animal() {
    this.animalid = (int) (Math.random() * 100);
    System.out.println("This is an Animal with id: " + this.animalid);
  }

  public String getSpecies() {
		return this.species;
	}

	public int getid() {
		return this.animalid;
	}

	public int getLifespan() {
		return this.lifespan;
	}


  
}

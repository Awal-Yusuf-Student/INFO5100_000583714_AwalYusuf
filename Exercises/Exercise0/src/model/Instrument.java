package model;

public class Instrument {
  int id;
  String name;
  String brand;
  enum HornbostelSachs {
    Idiophone, Membranophone, Chordophones, Aerophone};
  String classificatioon;
  enum Type {
    Experimental, Percussion, String, Transposing, Wind};
  int price;
  int warranty;

  public Instrument() {
		this.id = (int) (Math.random() * 100);
		System.out.println("Registering new Instrument with id: " + this.id);
	}

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

	public String getClassificatioon() {
		return this.classificatioon;
	}

	public void setClassificatioon(String classificatioon) {
		this.classificatioon = classificatioon;
	}


	
  
}
package model;

public class Apartment {
  int id;
	int numberOfWindows;
	int numberOfOccupants;
	boolean pool;
	boolean hardwoodFloors;
	boolean concierge;
	int size;
	boolean gym;
	int noOfBathrooms;

	public Apartment() {
		this.id = (int) (Math.random() * 100);
		System.out.println("Apartment ID: " + this.id);
	}

	public int getOccupancyNumber() {
		return this.numberOfOccupants;
	}

	public boolean getConcierge() {
		return this.concierge;
	}

	public void ApartmentAmenities() {
		if(this.pool == true && this.gym == true) {
      System.out.println("This apartment has a swimming pool and gym.");
    }
    else if(this.pool == true && this.gym == false) {
      System.out.println("This apartment only has a swimming pool.");
    }
    else if(this.pool == false && this.gym == true) {
      System.out.println("This apartment only has a gym");
    }
    else {
      System.out.println("This apartment does not have any ammenities");
    }
	}
}

package model;

import java.util.Date;

public class Computer {

  int id;
	String manufacturer;
	Date manufactureDate;
	int RAM;
	double weight;
	String screenSize;
	int GPU;
  class GraphicsCard {
		int id;
    String brand;

		public GraphicsCard() {
			this.id = (int) (Math.random() * 100);
			System.out.println("Graphics Card: " + this.id);
		}
	}
	class MemoryCard {
		int id;
    String brand;

		public MemoryCard() {
			this.id = (int) (Math.random() * 100);
			System.out.println("Memory Card: " + this.id);
		}
	}
  GraphicsCard graphicsCard;
  MemoryCard memoryCard;



	public Computer() {
    this.id = (int) (Math.random() * 100);
		this.graphicsCard = new GraphicsCard();
		this.memoryCard = new MemoryCard();
		System.out.println("Registering Computer with electronic id: " + this.id);

	}

	public GraphicsCard getGraphicsCard() {
		return this.graphicsCard;
	}

	public MemoryCard getMemoryCard() {
		return this.memoryCard;
	}

	public int getRAM() {
		return this.RAM;
	}
}

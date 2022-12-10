package model;


public class Television{
  int id;
  String DisplayType;
  String Resolution;
  int NoOfChannels;
  boolean HDR;
  int NoOfInputs;
  String Color;
  Boolean GamingFeature;
  String Wifi;

  public Television() {
		this.id = (int) (Math.random() * 100);
		System.out.println("Registering new Television with electronic id: " + this.id);
	}


  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDisplayType() {
    return this.DisplayType;
  }

  public void setDisplayType(String DisplayType) {
    this.DisplayType = DisplayType;
  }

  public String getResolution() {
    return this.Resolution;
  }

  public void setResolution(String Resolution) {
    this.Resolution = Resolution;
  }

}
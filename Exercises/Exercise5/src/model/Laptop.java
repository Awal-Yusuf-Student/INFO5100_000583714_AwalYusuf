package model;
//This examples shows the Builder design pattern. 
public class Laptop {
  
	
    //required parameters
    private String HDD;
    private String RAM;
    
    //optional parameters
    private boolean isWifiEnabled;
    private boolean isBluetoothEnabled;
    
  
    public String getHDD() {
      return HDD;
    }
  
    public String getRAM() {
      return RAM;
    }
  
    public boolean isWifiEnabled() {
      return isWifiEnabled;
    }
  
    public boolean isBluetoothEnabled() {
      return isBluetoothEnabled;
    }
    
    private Laptop(LaptopBuilder builder) {
      this.HDD=builder.HDD;
      this.RAM=builder.RAM;
      this.isWifiEnabled=builder.isWifiEnabled;
      this.isBluetoothEnabled=builder.isBluetoothEnabled;
    }
    
    //Builder Design Pattern Class
    public static class LaptopBuilder{
  
      
      private String HDD;
      private String RAM;
  
  
      private boolean isWifiEnabled;
      private boolean isBluetoothEnabled;
      
      public LaptopBuilder(String hdd, String ram){
        this.HDD=hdd;
        this.RAM=ram;
      }
  
      public LaptopBuilder setWifiEnabled(boolean isWifiEnabled) {
        this.isWifiEnabled = isWifiEnabled;
        return this;
      }
  
      public LaptopBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
        this.isBluetoothEnabled = isBluetoothEnabled;
        return this;
      }
      
      public Laptop build(){
        return new Laptop(this);
      }
  
    }
  
  }
  


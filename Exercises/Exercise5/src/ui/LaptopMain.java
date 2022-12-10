package ui;

import model.Laptop;

public class LaptopMain {
  Laptop Awalaptop = new Laptop.LaptopBuilder(
				"2TB", "8GB").setBluetoothEnabled(true)
				.setWifiEnabled(true).build();
  Laptop Dakshlaptop = new Laptop.LaptopBuilder(
          "4TB", "8GB").setBluetoothEnabled(false)
          .setWifiEnabled(true).build();
}

package com.skilldistillery.jets.entity;

public interface CargoCarrier {
	  
	  static String loadCargo(String cargo) {
	    return "Loading " + cargo;
	  }
	  
	  default int getCapacity() {
	    return 0;
	  }

	void loadCargo(int amount);
	
}

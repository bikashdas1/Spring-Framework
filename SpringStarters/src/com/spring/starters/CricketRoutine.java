package com.spring.starters;

public class CricketRoutine implements Routine {

	EnergyService energyService;
	
	public CricketRoutine(EnergyService energyServ) {
		this.energyService = energyServ;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Running 10 rounds around the field";
	}

	@Override
	public String getReplenishment() {
		return energyService.getReplenishment();
	}
	
	

}

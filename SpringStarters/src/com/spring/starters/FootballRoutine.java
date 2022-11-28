package com.spring.starters;

public class FootballRoutine implements Routine {

EnergyService energyService;
	
	public FootballRoutine(EnergyService energyServ) {
		this.energyService = energyServ;
	}
	
	@Override
	public String getDailyWorkout() {
		return "10 minutes lunges and long jumps";
	}
	
	@Override
	public String getReplenishment() {
		return energyService.getReplenishment();
	}

}

package com.spring.starters;

public class FootballRoutine implements Routine {

	EnergyService energyService;
	String dayRoutine;
	String energyRequired;

	public FootballRoutine(EnergyService energyServ) {
		this.energyService = energyServ;
	}

	public FootballRoutine() {
	}

	@Override
	public String getDailyWorkout() {
		return "10 minutes lunges and long jumps";
	}

	@Override
	public String getReplenishment() {
		return energyService.getReplenishment();
	}

	public void setEnergyService(EnergyService energyService) {
		this.energyService = energyService;
	}

	public void setEnergyRequired(String energyRequired) {
		this.energyRequired = energyRequired;
	}

	public void setDayRoutine(String dayRoutine) {
		this.dayRoutine = dayRoutine;
	}

	public String getEnergyRequired() {
		return this.energyRequired;
	}

	public String getDayRoutine() {
		return this.dayRoutine;
	}

}

package com.spring.starters;

public class CricketRoutine implements Routine {

	EnergyService energyService;
	private String energyRequired;
	private String dayRoutine;
	
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
	
	public void doMyStartupStuff() {
		System.out.println("The initialization method for cricket startup is called.");
		System.out.println("Overriding the energyRequired Value!");
		this.energyRequired = "Much more overridden energy";
	}
	
	public void doMyCleanup() {
		System.out.println("Destroy method is called for " + this.getClass());
	}

}

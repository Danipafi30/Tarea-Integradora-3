package model;

public class Coach extends GeneralCoach implements SoccerStars{
	private int teams;
	private int champs;
	
	public Coach(String name, String id, double salary, boolean state, int exp, int teams, int champs) {
		super(name, id, salary, state, exp);
		this.teams = teams;
		this.champs = champs;
	}

	@Override
	public double generalPrice() {
		double price = 0;
		price = (getSalary()*12)+(getExp()*150)+(champs*50);
		return price;
	}

	@Override
	public double level() {
		double level = 0;
		level = 5+(champs/100);
		return level;
	}
	
	public int getTeams() {
		return teams;
	}

	public void setTeams(int teams) {
		this.teams = teams;
	}

	public int getChamps() {
		return champs;
	}

	public void setChamps(int champs) {
		this.champs = champs;
	}
	

}

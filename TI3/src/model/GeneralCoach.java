package model;

public abstract class GeneralCoach extends Employee{
	private int exp;

	public GeneralCoach(String name, String id, double salary, boolean state, int exp) {
		super(name, id, salary, state);
		this.exp = exp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	

}

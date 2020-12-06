package model;

public class TechAssistant extends GeneralCoach{
	private boolean playerOrNot;
	private int strengh;
	
	public TechAssistant(String name, String id, int salary, boolean state, int exp, boolean playerOrNot, int strengh) {
		super(name, id, salary, state, exp);
		this.playerOrNot = playerOrNot;
		this.strengh = strengh;
	}

	public boolean isPlayerOrNot() {
		return playerOrNot;
	}

	public void setPlayerOrNot(boolean playerOrNot) {
		this.playerOrNot = playerOrNot;
	}

	public int getStrengh() {
		return strengh;
	}

	public void setStrengh(int strengh) {
		this.strengh = strengh;
	}
	
	
	
	

}

package model;

public class Player extends Employee implements SoccerStars{
	private int shirtNumber;
	private int goalNumber;
	private double calification;
	private int position;
	
	public Player(String name, String id, int salary, boolean state, int shirtNumber, int goalNumber, double calification, int position) {
		super(name, id, salary, state);
		this.shirtNumber = shirtNumber;
		this.goalNumber = goalNumber;
		this.calification = calification;
		this.position = position;
	}

	@Override
	public double generalPrice() {
		double price = 0;
		if(position == 1) {
			price = (getSalary()*12)+(calification*150);
		}else if(position == 2) {
			price = (getSalary()*13)+(calification*125)+(goalNumber*100);
		}else if(position == 3) {
			price = (getSalary()*14)+(calification*135)+(goalNumber*125);
		}else if(position == 4){
			price = (getSalary()*15)+(calification*145)+(goalNumber*150);
		}
		return price;
	}

	@Override
	public double level() {
		double level = 0;
		if(position == 1) {
			level = (calification*0.9);
		}else if(position == 2) {
			level = (calification*0.9)+(goalNumber/100);
		}else if(position == 3) {
			level = (calification*0.9)+(goalNumber/90);
		}else if(position == 4){
			level = (calification*0.9)+(goalNumber/80);
		}
		
		return level;
	}

	public int getShirtNumber() {
		return shirtNumber;
	}

	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	public int getGoalNumber() {
		return goalNumber;
	}

	public void setGoalNumber(int goalNumber) {
		this.goalNumber = goalNumber;
	}

	public double getCalification() {
		return calification;
	}

	public void setCalification(double calification) {
		this.calification = calification;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	
	
}

package model;

public class Team {
	private String nameTeam;
	private LineUp lineup;
	private Coach coach;
	private TechAssistant[] technical;
	private Player[] players;
	private Employee[] employees;
	
	public Team(String nameTeam) {
		this.nameTeam = nameTeam;
		technical = new TechAssistant[3];
		players = new Player[25];
		employees = new Employee[29];
	}
	
	public void fillEmployees() {
		employees[0] = coach;
		employees[1] = technical[0];
		employees[2] = technical[1];
		employees[3] = technical[2];
		for(int i=4; i<employees.length; i++) {
			employees[i] = players[i-4];
		}
	}
	
	public boolean findEmployee(String id) {
		fillEmployees();
		boolean found = false;
		for (int i=0; i<employees.length && !found; i++) {
			if (employees[i] != null) {
				if(employees[i].getId().equals(id)) {
					found = true;
				}
			}
		}
		return found;
	}

	public String getNameTeam() {
		return nameTeam;
	}

	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}

	public LineUp getLineup() {
		return lineup;
	}

	public void setLineup(LineUp lineup) {
		this.lineup = lineup;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public TechAssistant[] getTechnical() {
		return technical;
	}

	public void setTechnical(TechAssistant[] technical) {
		this.technical = technical;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}
	
	
	
	
	
}

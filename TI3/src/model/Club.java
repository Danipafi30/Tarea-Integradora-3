package model;


public class Club {
	private String name;
	private String nit;
	private String dateFoundation;
	private Team[] teams;
	private int room1[][];
	private int room2[][];
	private int offices[][];

	public Club(String name, String nit, String dateFoundation) {
		this.name = name;
		this.nit = nit;
		this.dateFoundation = dateFoundation;
		teams = new Team[2];
		room1 = new int[7][6];
		room2 = new int[7][7];
		offices = new int[6][6];
	}

	public String addTeam(String nameTeam) {
		String msg = "";
		boolean found = findTeam(nameTeam);
		if (!found) {
			Team aux = new Team(nameTeam);
			for (int i=0; i<teams.length && !found; i++) {
				if (teams[i] == null) {
					teams[i] = aux;
					found = true;
					msg = "The team has been added";
				}
			}
			if (!found) {
				msg = "The capacity for teams is full";
			}
		}else {
			msg = "This team is already added";
		}
		return msg;
	}

	public boolean findTeam (String nameTeam) {
		boolean found = false;
		for (int i=0; i<teams.length && !found; i++) {
			if (teams[i] != null) {
				if(teams[i].getNameTeam().equals(nameTeam)) {
					found = true;
				}
			}
		}
		return found;
	}

	public String addCoach(String name, String id, double salary, boolean state, int exp, int teams, int champs, int team) {
		String msg = "";
		boolean found = findEmployee(id);
		if (!found) {
			Coach coach = new Coach(name, id, salary, state, exp, teams, champs);
			if (team == 1 && this.teams[0].getCoach() == null) {
				this.teams[0].setCoach(coach);
				found = true;
				msg = "The coach was added";
			}else if(team == 2 && this.teams[1].getCoach() == null) {
				this.teams[1].setCoach(coach);
				found = true;
				msg = "The coach was added";
			}
			if (!found) {
				msg = "There is already a coach in this team";
			}
		}else {
			msg = "This coach is already added";
		}
		if(team == 1) {
			
		}
		return msg;
	}


	public boolean findEmployee(String id) {
		boolean found1 = teams[0].findEmployee(id);
		boolean found2 = teams[1].findEmployee(id);
		boolean found = false;
		if(found1 || found2) {
			found = true;
		}
		return found;
	}





	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getDateFoundation() {
		return dateFoundation;
	}

	public void setDateFoundation(String dateFoundation) {
		this.dateFoundation = dateFoundation;
	}




}

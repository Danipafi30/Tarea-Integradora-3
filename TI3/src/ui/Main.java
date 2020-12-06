package ui;

import java.util.Scanner;

import model.Club;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	private Club control;

	public Main () {
		
	}


	public static void main(String[] args) {
		Main view = new Main();
		view.showMenu();
	}

	public void showMenu() {
		int option = 0;
		do {
			System.out.println("1) Create a Club");
			System.out.println("2) Add a team");
			System.out.println("3) Add a employee");
			System.out.println("4) Add a technical assistant");
			System.out.println("5) Add a player");
			System.out.println("0) Close program");
			option = Integer.parseInt(sc.nextLine());
			switch(option) {
			case 1:
				System.out.println("Enter the name of the club");
				String name = sc.nextLine();
				System.out.println("Enter the NIT of the club");
				String nit = sc.nextLine();
				System.out.println("Enter the foundation date of the club");
			    String dateFoundation = sc.nextLine();
				createClub(name, nit, dateFoundation);
				break;
			case 2:
				System.out.println("Enter the name of the team");
				String nameTeam = sc.nextLine();
				addTeam(nameTeam);
				break;
			case 3:
				System.out.println("Enter the name of the employee");
				String nameEmployee = sc.nextLine();
				System.out.println("Enter the id of the employee");
				String id = sc.nextLine();
				System.out.println("Enter the salary of the employee");
				double salary = Double.parseDouble(sc.nextLine());
				System.out.println("Enter the state of the employee \n1. Active \n2. In-active");
				boolean state = sc.nextLine().equals("1");
				addEmployee(nameEmployee, id, salary, state);
				break;
			case 4:

				String msg3 = control.toString();
				System.out.println(msg3);
				break;
			default:
				System.out.println("The option u choose isn't available");
				break;
			}
		}while(option != 0);
	}
	
	public void createClub(String name, String nit, String dateFoundation) {
		control = new Club(name, nit, dateFoundation);
	}
	
	public void addTeam(String nameTeam) {
		String msg = control.addTeam(nameTeam);
		System.out.println(msg);
	}
	
	public void addEmployee(String name, String id, double salary, boolean state) {
		int option = 0;
		System.out.println("1) Add a coach");
		System.out.println("2) Add a technical assistant");
		System.out.println("3) Add a player");
		System.out.println("0) Close program");
		option = Integer.parseInt(sc.nextLine());
		switch(option) {
		case 1:
			addCoach(name, id, salary, state);
			break;
		case 2:
			addTechAssistant(name, id, salary, state);
			break;
		case 3:
			addPlayer(name, id, salary, state);
			break;
		default:
			System.out.println("The option u choose isn't available");
			break;
		}
	}
	
	public void addCoach(String name, String id, double salary, boolean state) {
		System.out.println("Enter the years of experience of the coach");
		int exp = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the teams coached by the coach");
		int teams = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the championships won by the coach");
		int champs = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the team of the coach \n1. Team A \n Team B");
		int team = Integer.parseInt(sc.nextLine());
		String msg = control.addCoach(name, id, salary, state, exp, teams, champs, team);
		System.out.println(msg);
	}
	
	public void addTechAssistant(String name, String id, double salary, boolean state) {
		System.out.println("Enter the years of experience of the coach");
		String exp = sc.nextLine();
		System.out.println("The assistant was once a player? \n1. Player \n2. Not player");
		boolean playerOrNot = sc.nextLine().equals("1");
		System.out.println("Enter the expertise of the assistant");
		int strengh = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the team of the assistant");
		int team = Integer.parseInt(sc.nextLine());
	}
	public void addPlayer(String name, String id, double salary, boolean state) {
		System.out.println("Enter the T-shirt number of the player");
		int shirtnumber = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the total of goals of the player in the club");
		int goalnumber = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the calification of the player");
		double calification = Double.parseDouble(sc.nextLine());
		System.out.println("Enter the position of the player \n1. Goalkeeper \n2. Defender \n3. Midfielder \n 4. Forward");
		int position = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the team of the player");
		int team = Integer.parseInt(sc.nextLine());
	}
}

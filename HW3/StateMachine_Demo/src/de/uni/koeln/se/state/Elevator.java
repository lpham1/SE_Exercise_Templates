package de.uni.koeln.se.state;

public class Elevator {

	public static int current_Floor = 5;
	int dest_Floor;

	private Elv_States State = new Elv_States();

	public Elevator(int dest_floor) {
		this.dest_Floor = dest_floor;
		System.out.println("State: " + State);
		System.out.println("*** Destination floor is: " + dest_Floor);
		while(dest_Floor != current_Floor) {
			move(dest_Floor);	
		}
		System.out.println("You may exit now");

	}

	private void move(int x) {
		x = this.dest_Floor;
		if(current_Floor < x) {
			System.out.println(State.Moving_up);
			current_Floor +=1;
		}
		else {
			System.out.println(State.Moving_down);
			current_Floor -=1;
		}
		arrive_atFloor();
	}

	private void arrive_atFloor() {
		System.out.println("Arrived at: " + current_Floor);
	}
}

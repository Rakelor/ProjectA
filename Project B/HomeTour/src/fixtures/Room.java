package fixtures;

import game.Player;

public class Room extends Fixture{
	public Room[] exits = new Room[4];
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; // size is your choice
		this.name =name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
	public Room[] getExits() {
		return exits;
	}
	
	public static Room getExits(String Direction, Player r) {
		int i;
		if (Direction.toLowerCase().equals("north")) {
			i = 0;	
		}
		else if (Direction.toLowerCase().equals("east")) {
			i = 1;	
		}
		else if (Direction.toLowerCase().equals("south")) {
			i = 2;	
		}
		else if (Direction.toLowerCase().equals("west")) {
			i = 3;	
		}
		else {
			return r.currentRoom;
		}
		 
		return r.currentRoom.exits[i];
	}
	
	public void setNExit(Room rm) {
		this.exits[0] = rm;
	}
	
	public void setEExit(Room rm) {
		this.exits[1] = rm;
	}
	
	public void setSExit(Room rm) {
		this.exits[2] = rm;
	}
	
	public void setWExit(Room rm) {
		this.exits[3] = rm;
	}
	
	/*
	 * public Room getLeftExit(){
	 * return exits[0];
	 * }
	 * 
	 * public Room getRightExit(){
	 * return exits[1];
	 * }
	 * 
	 * public Room(String name){
	 * this.name = name;
	 * }
	 */
}


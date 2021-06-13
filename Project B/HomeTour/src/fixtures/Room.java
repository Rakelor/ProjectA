package fixtures;

public class Room extends Fixture{
	Room[] exits = new Room[4];
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; // size is your choice
		
	}
	
	public Room[] getExits() {
		return exits;
	}
	
	public Room getExit(String direction) {
		return exits[1];
	}
}


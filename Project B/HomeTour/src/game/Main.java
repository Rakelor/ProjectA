package game;

import java.util.Scanner;
import fixtures.Room;
import game.Player;
import game.RoomManager;

public class Main {
	private static Scanner scan = new Scanner(System.in);
	static String[] input = new String[2];

	static boolean flag= true;
	
	/*
	 * RoomManager rm = new RoomManager();
	 * rm.init();
	 * 
	 * Room currentRoom =rm.startingRoom;
	 * boolean quit = false;
	 * while(!quit) {
	 * sysout(currentRoom);
	 * sysout("Where do you want to go? Left or right?"
	 * + "\nOr do you want to quit?");
	 * string input = scan.next();
	 * if (input.trim().toLowerCase().equals("quit") {
	 * quit = true;
	 * continue;
	 * }
	 * Room nextRoom = null;
	 * if (input.equals("left")){
	 * nextRoom = currentRoom.getLeftExit();
	 * }else if (input.equals("right")) {
	 * nextRoom = currentRoom.getRightExit();
	 * }
	 * 
	 * if (nextRoom != null) {
	 * currentRoom = nextRoom;
	 * remember to make sure that there are visible choices
	 * for choosing where to go.
	 * make it so the input is put into a string array
	 * so that everything is put well into the array.
	 * 
	 * Maybe only use scanner's .next and ask for the 
	 * action and then the direction based on what the exits are
	 * 
	 */

	public static void main(String[] args) {
		Player a = new Player();
		RoomManager rm = new RoomManager();
		rm.init(a);
		Room nextRoom = null;
		while(flag) {
			printRoom(a);
			collectInput();
			System.out.println(parse(input, a).name);
			nextRoom= parse(input, a);
			rm.init(a, nextRoom);			
			
		}
	}
	
	private static void printRoom(Player obj) {
		System.out.println("The "+obj.currentRoom.name);
		System.out.println("\n\n"+ obj.currentRoom.longDescription);
		if (obj.currentRoom.exits[0]==null) {
			
		} else {
			System.out.println("The "+obj.currentRoom.exits[0].name+" is to the north.");
		}
		if (obj.currentRoom.exits[1]==null) {
			
		} else {
			System.out.println("The "+obj.currentRoom.exits[1].name+" is to the east.");
		}
		if (obj.currentRoom.exits[2]==null) {
			
		} else {
			System.out.println("The "+obj.currentRoom.exits[2].name+" is to the south.");
		}
		if (obj.currentRoom.exits[3]==null) {
			
		} else {
			System.out.println("The "+obj.currentRoom.exits[3].name+" is to the west.");
		}
	}
	
	private static void collectInput() {
		input = scan.nextLine().split(" ", 2);
	
	}
	private static Room parse(String[] command, Player player) {
		if (command[0].toLowerCase().equals("go")) {
			return Room.getExits(command[1], player);
		}
		else if (command[0].toLowerCase().equals("quit")) {
			flag = false;
		}
		else {
			System.out.println("Sorry, that didn't make sense. Breath, and give it another try. You can do it!");
		}
		return null;
	}
}

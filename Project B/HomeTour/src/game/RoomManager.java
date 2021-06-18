package game;
import fixtures.Room;

/*
 * Room startingRoom;
 * Room[] allRooms;
 * 
 * public void init() {
 * Room kit = new Room("Kit");
 * Room lr = new Room("lr");
 * 
 * allRooms= new Room[2];
 * allRooms[0]= kit;
 * allRooms[1]=lr;
 * using the map(allRooms) can be used to have secret rooms, etc.
 * lr.setRightExit(kit);
 * kit.setLeftExit(lr);
 * startingRoom lr;
 */

public class RoomManager {
	public Room startingRoom;
	public Room[] allRooms;
	
	public void init(Player a) {
		Room entry = new Room("Entry","The Entryway","The Entryway that you see when entering the house, there are three doorways to go through and a sliding closet to your left.");
		Room dnrm = new Room("Dining Room","The Dining Room","The place we eat when we have guests. It has a wood panelled floor. There is a flower arrangement in the center of the\n"
				+ " table, and several decorative kicknacks, a mix of silver and ceramic in the built in shelves on the wall. There is also two paintings, and an old chest with a\n"
				+ " few family photos on it.");
		Room jnkrm = new Room("Junk Room", "A laundry room", "The Junk room, the place for laundry, files, some tools, a door to the office, and a bit of mess. You feel like you're\n"
				+ " not supposed to be here.");
		Room bthrm1= new Room("First Bathroom","A bathroom in the entryway", "The bathroom looks recently refurbished with tiles on the floor, and oddly a framed poster \n"
				+"of a fat cardinal walking along a river, the artist is named Fernando Botero.");
		Room ktchn = new Room("Kitchen", "A fully stocked kitchen","A tiled kitchen with a chrome refrigerator, oven, and washing machine. The countertop is marbeled and the cabinets \n"
				+ "are all white. The appliances seem to be exclusively red with only a few exceptions.");
		Room ofce = new Room("Office", "A room living room/office", "The room has an older computer with a multi-use printer that seems well used. There is a TV on a stand to the\n"
				+ "side of it with a couch on the other side of the room. Above the couch is a painting, and below it a rug.");
		Room hllwy1 = new Room("Hallway", "The first stretch of a long hallway.","The hallway is wood paneled, and has a small parlor to your right that is a part of the hallway\n"
				+ "on the other side of a small divider in the parlor is another entrance, it doesn't seem used. Opposite the locked door is what seems to be another\n"
				+ "office/living room. The hallway stretches on, but there seems to be something stopping you from going on...");
		Room ofce2 = new Room("Office 2: Revengeance", "An ordinary office/living room.", "This room is carpeted, and has two armchairs, a couch, a bookcase, a TV with a PS4 hooked up\n"
				+ " and a new keyboard and monitor hooked up to...a laptop held together by duck tape? There's a man sitting in the chair in front of it giving a presentation on \n"
				+ "something, he doesn't notice you.");
		entry.setEExit(dnrm);
		entry.setNExit(jnkrm);
		entry.setWExit(bthrm1);
		jnkrm.setSExit(entry);
		jnkrm.setEExit(ofce);
		dnrm.setNExit(ofce);
		dnrm.setEExit(hllwy1);
		dnrm.setSExit(ktchn);
		dnrm.setWExit(entry);
		bthrm1.setEExit(entry);
		ktchn.setNExit(dnrm);
		ofce.setSExit(dnrm);
		ofce.setWExit(jnkrm);
		hllwy1.setNExit(ofce2);
		ofce2.setSExit(hllwy1);
		a.currentRoom = entry;
	}
	
	public void init(Player a, Room r) {
		Room entry = new Room("Entry","The Entryway","The Entryway that you see when entering the house, there are three doorways to go through and a sliding closet to your left.");
		Room dnrm = new Room("Dining Room","The Dining Room","The place we eat when we have guests. It has a wood panelled floor. There is a flower arrangement in the center of the"
				+ " table, and several decorative kicknacks, a mix of silver and ceramic in the built in shelves on the wall. There is also two paintings, and an old chest with a"
				+ " few family photos on it.");
		Room jnkrm = new Room("Junk Room", "A laundry room", "The Junk room, the place for laundry, files, some tools, a door to the office, and a bit of mess. You feel like you're"
				+ " not supposed to be here.");
		Room bthrm1= new Room("First Bathroom","A bathroom in the entryway", "The bathroom looks recently refurbished with tiles on the floor, and oddly a framed poster "
				+"of a fat cardinal walking along a river, the artist is named Fernando Botero.");
		Room ktchn = new Room("Kitchen", "A fully stocked kitchen","A tiled kitchen with a chrome refrigerator, oven, and washing machine. The countertop is marbeled and the cabinets "
				+ "are all white. The appliances seem to be exclusively red with only a few exceptions.");
		Room ofce = new Room("Office", "A room living room/office", "The room has an older computer with a multi-use printer that seems well used. There is a TV on a stand to the"
				+ "side of it with a couch on the other side of the room. Above the couch is a painting, and below it a rug.");
		Room hllwy1 = new Room("Hallway", "The first stretch of a long hallway.","The hallway is wood paneled, and has a small parlor to your right that is a part of the hallway"
				+ " on the other side of a small divider in the parlor is another entrance, it doesn't seem used. Opposite the locked door is what seems to be another "
				+ "office/living room. The hallway stretches on, but there seems to be something stopping you from going on...");
		Room ofce2 = new Room("Office 2: Revengeance", "An ordinary office/living room.", "This room is carpeted, and has two armchairs, a couch, a bookcase, a TV with a PS4 hooked up"
				+ " and a new keyboard and monitor hooked up to...a laptop held together by duck tape? There's a man sitting in the chair in front of it giving a presentation on "
				+ "something, he doesn't notice you.");
		entry.setEExit(dnrm);
		entry.setNExit(jnkrm);
		entry.setWExit(bthrm1);
		jnkrm.setSExit(entry);
		jnkrm.setEExit(ofce);
		dnrm.setNExit(ofce);
		dnrm.setEExit(hllwy1);
		dnrm.setSExit(ktchn);
		dnrm.setWExit(entry);
		bthrm1.setEExit(entry);
		ktchn.setNExit(dnrm);
		ofce.setSExit(dnrm);
		ofce.setWExit(jnkrm);
		hllwy1.setNExit(ofce2);
		ofce2.setSExit(hllwy1);
		a.currentRoom = r;
	}
	
}

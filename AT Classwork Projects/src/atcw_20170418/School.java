package atcw_20170418;

import java.util.ArrayList;

public class School {
	ArrayList<Room> rooms = new ArrayList<Room>();
	
	School() {
		rooms.add(new Room("F115", 20));
		rooms.add(new Room("P325", 18));
		rooms.add(new Room("A318", 16));
		rooms.add(new Room("S301", 22));
	}
	
	/**
	 * 
	 * @return A String array with all of the room IDs
	 */
	String[] getRoomsArray() {
		String[] r = new String[rooms.size()];
		for(int i = 0; i < r.length; i++)
			r[i] = rooms.get(i).getId();
		return r;
	}
	
	/**
	 * @return A String with all of the room IDs and their capacities
	 */
	public String toString() {
		String s = "";
		for(int i = 0; i < rooms.size(); i++) {
			s += rooms.get(i).toString() + "\n";
		}
		return s;
	}

	/**
	 * Takes a room ID and removes that room from the 'rooms' arraylist
	 * @param id - A string indentifier of the room
	 * @return true if the room is removed, false if nothing is removed
	 */
	boolean removeRoom(String id) {
		for(int i = 0; i < rooms.size(); i++) {
			if(rooms.get(i).getId().equals(id)) {
				rooms.remove(i);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Removes a random room
	 * @return true if a room is removed, false if not.
	 */
	boolean removeRoom() {
		if(rooms.size() > 0) {
			int index = (int)(Math.random() * rooms.size());
			return removeRoom(rooms.get(index).getId());
		}
		return false;
	}
	
	/**
	 * 
	 * @return An int containing the number of rooms
	 */
	int getNumberOfRoom() {
		return rooms.size();
	}
}

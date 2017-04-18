package atcw_20170418;

public class Room {
	String id;
	int capacity;
	
	Room(String _id, int _capacity) {
		id = _id;
		capacity = _capacity;
	}
	
	/**
	 * Returns the string identifier of the room object
	 * @return A String with the id of the room
	 */
	String getId() {
		return id;
	}
	
	/**
	 * Return the capacity of the room object
	 * @return An integer representing the capacity of the room
	 */
	int getCapacity() {
		return capacity;
	}
	
	/**
	 * Returns the room identifier and its capacity
	 */
	public String toString() {
		return id + " (" + capacity + ")";
	}
}

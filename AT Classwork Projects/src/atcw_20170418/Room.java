package atcw_20170418;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Room {
	String id;
	int capacity;
	ArrayList<Reservation> reservations;
	
	Room(String _id, int _capacity) {
		id = _id;
		capacity = _capacity;
		reservations = new ArrayList<Reservation>();
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
		clearPassed();
		String s =  id + " (Capacity: " + capacity + ")";
		if(reservations.size() == 0) {
			s += " - No Reservations.\n";
		} else {
			s += " - Reserved on:\n";
		}
		for(int i = 0; i < reservations.size(); i++) {
			s += reservations.get(i).toString() + "\n";
		}
		return s;
	}
	
	void clearPassed() {
		Calendar today = new GregorianCalendar();
		for(int i = reservations.size()-1; i >= 0; i--) {
			if(today.after(reservations.get(i).date)) {
				reservations.remove(i);
			}
		}
	}
	
	/**
	 * Reserve the room for the specified date
	 * @param Takes a calendar object
	 * @return Returns true if the room was successfully reserved, false if not
	 */
	boolean reserve(Calendar date) {
		Calendar today = new GregorianCalendar();
		if(!isReserved(date) && today.before(date)) {
			return reservations.add(new Reservation(this, date));
		}
		return false;
	}
	
	boolean isReserved(Calendar date) {
		for(int i = 0; i < reservations.size(); i++) {
			if(reservations.get(i).inConflict(date)) {
				return true;
			}
		}
		return false;
	}
}

package atcw_20170418;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Reservation {
	Room room;
	Calendar date;
	private SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
	
	Reservation(Room _room, Calendar _date) {
		room = _room;
		date = _date;
	}
	
	public boolean inConflict(Calendar _date) {
		return date.equals(_date);
	}
	
	public String toString() {
		return format1.format(date.getTime());
	}

}

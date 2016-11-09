
import java.util.Date;

public class date {

	public static void main(String[] args) {
		//Days from now
		int days = 20000;
		System.out.print(days + " days from now is: ");
		daysFromNow(days);
		System.out.println();
		
		//Days till graduation
		System.out.println("There are " + daysTillGraduation() + " days till graduation.");
		System.out.println();
		
		//Delay function
		Date now = new Date();
		System.out.println("It is now: " + now.toString());
		while(secondsSince(now) < 10);
		now = new Date();
		System.out.println("It is now: " + now.toString());
	}

	//Prints out the date "days" days from when it is run
	static void daysFromNow(int days) {
		Date now = new Date();
		long hours = days * 24;
		long minutes = hours * 60;
		long seconds = minutes * 60;
		long mil = seconds * 1000;
		long nowMil = now.getTime();
		Date then = new Date(nowMil + mil);
		System.out.println(then.toString());
	}

	//Returns the number of days until graduation
	static int daysTillGraduation() {
		Date graduation = new Date(1497650400000l);
		Date now = new Date();
		long millis = graduation.getTime() - now.getTime();
		long seconds = millis/1000;
		long minutes = seconds/60;
		long hours = minutes/60;
		long days = hours/24;
		return (int)days;
	}
	
	//Returns the number of seconds since the date stored in "d"
	static int secondsSince(Date d) {
		Date now = new Date();
		long millis = now.getTime() - d.getTime();
		int seconds = (int) millis/1000;
		return seconds; 
	}
}

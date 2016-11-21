package atcw_20161101;
// Greg Benedis-Grab

import java.util.Date;

public class Dates {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		long numMillis = now.getTime();
		numMillis += 30*1000*60*60*24l;
		System.out.println(numMillis);
		Date future = new Date(numMillis);
		System.out.println(future.toString());
	}
}

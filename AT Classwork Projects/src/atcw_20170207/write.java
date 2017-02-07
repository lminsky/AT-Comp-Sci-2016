package atcw_20170207;

import java.io.FileWriter;
import java.io.IOException;

public class write {

	public static void main(String[] args) throws IOException{
		FileWriter fw;
		fw = new FileWriter("out.txt", true);
	
		for (int i = 0; i < 10; i++) {
			fw.write("hello " + i + "\n");
		}
	 
		fw.close();
		 
	}

}

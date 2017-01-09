package atcs_20170106;

import java.io.FileWriter;
import java.io.IOException;

public class write {

	public static void main(String[] args) throws IOException {
			FileWriter fw = new FileWriter("out.txt");
			fw.write("HELLO");
			fw.close();
	}
}

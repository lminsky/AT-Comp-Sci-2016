package atcs_20170109;

import java.io.BufferedReader;
import java.io.FileReader;

public class read {

	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("out.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String input;
			String[] dataString = null;
			while((input = br.readLine()) != null) {
//				System.out.println(input);
				dataString = input.split(",");
			}
			
			int[] data = new int[dataString.length];
			for(int i = 0; i < dataString.length; i++) {
				data[i] = Integer.parseInt(dataString[i]);
			}
			
		} catch (Exception e) {
			
		}

	}

}

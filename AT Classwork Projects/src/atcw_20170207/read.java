package atcw_20170207;

import java.io.BufferedReader;
import java.io.FileReader;

public class read {

	public static void main(String[] args){
		FileReader fr;
		try {
			fr = new FileReader("out.txt");
			BufferedReader br = new BufferedReader(fr); 
			String s; 
			while((s = br.readLine()) != null) { 
			System.out.println(s); 
			} 
			fr.close(); 
		} catch (Exception failure) {
			System.out.println(failure);
		} 
		

	}

}

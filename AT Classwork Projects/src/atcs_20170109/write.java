package atcs_20170109;

import java.io.FileWriter;

public class write {

  public static void main(String[] args){
    FileWriter fw;
    try {
      fw = new FileWriter("out.txt");
      String s = "";
      for(int i = 0; i < 5; i++) {
    	  	s += (int)(Math.random()*100);
    	  	if(i < 4)
    	  		s += ",";
      }
      fw.write(s);
      fw.close();
    } catch (Exception e) {
      System.out.println("There was an error");
    }
     
  }

}

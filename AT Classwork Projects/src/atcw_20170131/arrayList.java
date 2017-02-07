package atcw_20170131;

import java.util.ArrayList;

public class arrayList {

   public static void main(String args[]) {
      ArrayList<String> a = new ArrayList<String>();
      ArrayList<Integer> b = new ArrayList<Integer>();
      
      b.add(5);
      b.add(6);
      b.add(7);
      b.ensureCapacity(10);
      
      a.add("Hello");
      a.add("World");
      a.add("Test");
      a.set(2, "Anything");
      
      Object[] x = b.toArray();
      int[] z = new int[3];
      for(int i = 0; i < x.length; i++)
    	  z[i] = (int)(x[i]);


      System.out.println(b);
      System.out.println(b.size());
      for(int i = 0; i < a.size(); i++) {
    	  	System.out.println(a.get(i));
      }
   }
}
package BasicDemo;

import java.util.HashSet;

public class Hashstage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashSet<String> VP=new HashSet<String>();
   
   VP.add("VPP");
   VP.add("RPA");
   VP.add("RSC");
   
   System.out.println(VP);
   
   System.out.println(VP.size());
   System.out.println(VP.contains("RPA"));
   System.out.println(VP.isEmpty());
   System.out.println(VP.remove("RSC"));
   System.out.println(VP.add("RAS"));
   
   
   
   
   
	}

}

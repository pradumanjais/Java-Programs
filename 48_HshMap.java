package java_programs;

import java.util.HashMap;

public class HshMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "ankur");
		map.put(102, "pramod");
		map.put(103, "taksh");
		map.put(104, "ram");
		map.put(102, "ram"); 
		
		System.out.println(map);
	}

}

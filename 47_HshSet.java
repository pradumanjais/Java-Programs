package java_programs;

import java.util.HashSet;

public class HshSet {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		h.add("Taksh");
		h.add(200);
		h.add(101);
		h.add(200);
		h.add("Ankur");
		h.add(null);
		
		System.out.println(h);

	}

}

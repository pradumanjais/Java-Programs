package java_programs;

import java.util.ArrayList;
import java.util.Collections;

public class ArayList {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList(); // Creating Array List
		
		//Adding the object in Array list
		
		l.add("Taksh");
		l.add("Z102");
		l.add("true");
		l.add("Aman");
		l.add("Ankit");
		l.add("X600");
		
		l.set(2, "false");
		
		System.out.println(l);
		System.out.println(l.get(2));
		
		l.remove(2);
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println(l);
	}

}

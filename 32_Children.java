package oops_concept;

// multi-level inheritence.
class Grandparents {
	
	public void gold() {
		System.out.println("Gold");
	}
}

class Parent extends Grandparents {
	public void lands() {
		System.out.println("Lands");
	}
}

public class Children extends Parent {
	
	public void shares() {
		System.out.println("Shares");
	}

	public static void main(String[] args) {
		
		Children c = new Children();
		c.shares();
		c.lands();
		c.gold();
		
		System.out.println();
		
		Parent p = new Parent();
		p.lands();
		p.gold();
		
		System.out.println();
		
		Grandparents g = new Grandparents();
		g.gold();
	}

}

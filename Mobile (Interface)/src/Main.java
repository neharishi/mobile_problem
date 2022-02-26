
public class Main {
	
	public static void main(String[] args) {
		
	// A simple mobile:
    	Branch x = new Branch(5, new Weight(1));
  	Branch y = new Branch(6, new Weight(2));
  	Mobile z = new Mobile(x, y);

	//A larger mobile:
  	Branch b7 = new Branch(8, new Weight(1));
  	Branch b8 = new Branch(2, new Weight(4));
  	Mobile m4 = new Mobile(b7, b8);
  	Branch b5 = new Branch(5, new Weight(2));
  	Branch b6 = new Branch(2, m4);
  	Mobile m3 = new Mobile(b5, b6);
  	Branch b3 = new Branch(3, new Weight(4));
  	Branch b4 = new Branch(4, new Weight(3));
  	Mobile m2 = new Mobile(b3,b4);
  	Branch b1 = new Branch(6, m2);
  	Branch b2 = new Branch(6, m3);
  	Mobile m1 = new Mobile(b1, b2);

	//Test cases:
  	System.out.println(m1.getWeight()); //14.0
  	System.out.println(m1.isBalanced()); //true
     
  	System.out.println(z.getWeight()); //3.0
  	System.out.println(z.isBalanced()); //false

		
	}

}

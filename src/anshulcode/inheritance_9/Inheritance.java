package anshulcode.inheritance_9;

public class Inheritance {

	public static void main(String[] args) {

		// example of single inheritance
		Child obj =new Child();
		obj.multiply(5, 10);
		obj.divide(10, 2);
		obj.sum(10, 20);
		obj.subtract(15, 6);
	
		
		// example of multilevel inheritance
		Grandchild obj1 = new Grandchild();
			obj1.multiply(1, 2);
			obj1.display();
			obj1.multiply(5, 10);
			obj1.divide(10, 2);
			obj1.sum(10, 20);
			obj1.subtract(15, 6);
			
			
			
			// Class Child and Child1 both are extending Parent. Hence it is called Hierarchical Inheritance 
			Child1 child1 =new Child1();
			child1.sum(10, 20);
			child1.subtract(15, 6);
			child1.kashish();
			
		}
	

}

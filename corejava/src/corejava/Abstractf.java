package corejava;

class car{ //create class
	
	car(){  // create constructor
		System.out.println("car is built"); //print car is built
		 
			 
			 }
	public void gearchange() {   //create method
		System.out.println("gear change ");  //print gear change
		
		}
		
		
	}
class Tesla extends car{  //create another class extends parent class
	public void drive() { // create drive method
		System.out.println("gear change method");  //print gear change method
	}
	
}



public class Abstractf { // create main class

	public static void main(String[] args) {  //create main method
	 Tesla t=new Tesla(); //create an object
	 t.gearchange();  //call gearchange method
     t.drive();
	}

}

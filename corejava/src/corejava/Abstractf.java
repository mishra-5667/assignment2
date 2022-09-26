package corejava;

class car{
	
	car(){
		System.out.println("car is built");
		 
			 
			 }
	void gearchange() {
		System.out.println("gear change ");
		
		}
		
		
	}
class Tesla extends car{
	void drive() {
		System.out.println("gear change method");
	}
	
}



public class Abstractf {

	public static void main(String[] args) {
	 car c=new car();
	 c.gearchange();

	}

}

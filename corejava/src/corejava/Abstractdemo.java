package corejava;

public class Abstractdemo {
void display() {
	System.out.println("abstractiony");
}
}
class testAbstract extends Abstractdemo{
	public static void main(String[]args) {
		testAbstract t=new testAbstract();
		t.display();
	}
}

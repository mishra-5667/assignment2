package corejava;


class laptop{
	void display() {
		System.out.println("Working");
	}
}
class dell extends laptop{
	void print() {
		System.out.println("dell inspiron");
	}
}
class lenovo extends laptop{
	void show() {
		System.out.println("lenovo yoga");
	}
}
public class Sym {

	public static void main(String[] args) {
		dell d=new dell();
		d.print();
		d.display();
		lenovo l=new lenovo();
		l.show();
		l.display();

	}

}

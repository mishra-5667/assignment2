package corejava;


class Polygon{
	//create an object of square
	public void render() {
		System.out.println("Rendering polygon");
	}
}
class square extends Polygon{
	//renders square
	public void render() {
		System.out.println("Rendering square");
	}
}
class circle extends Polygon{
	//renders circle
	public void render() {
		System.out.println("Rendering circle");
	}
}
public class Poly {

	public static void main(String[] args) {
		//create an object of square
		square s1=new square();
		s1.render();
        //create an object of circle
		circle c=new circle();
		c.render();
	}

}

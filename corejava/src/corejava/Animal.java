package corejava;

class Anima{
	  public void eat() {
		   System.out.println("i can eat");
	   }
	}
		   class Dog extends Anima{
			
				public String name;

				public void display() {
					
					System.out.println("My name is:"+name);
				}


   }

			class Animal{
				
	public static void main(String[] args) {
	
		Dog d=new Dog();
		d.name="bulldog";
		d.display();
		d.eat();
	}
		}

	

		
	

	



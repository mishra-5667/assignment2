package corejava;

class Mon{
	//creating method
	public int sum(int x,int y) {
		return (x+y);
	}
	//creating method sum(int,int,int)
	public int sum(int x,int y,int z) {
		
			return (x+y+z);
		}
	//creating method sum (,double,double)overloading
		public double sum(double x,double y ) {
			return( x+y);
		}
	
public static void main(String[] args) {
		
   Mon s1=new Mon();
   System.out.println(s1.sum(6,3));//calling method sum(int,int)
   System.out.println(s1.sum(49,3));//calling method sum (int,int,int)
   System.out.println(s1.sum(4,3,67));//calling method sum (double,double)
	}

}

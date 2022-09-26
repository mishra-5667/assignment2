package corejava;

class Encapsulationdemo{
	private int ssn;
	private String empname;
	private int empage;
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	
}

public class Enc {

	public static void main(String[] args) {
		
   Encapsulationdemo e=new Encapsulationdemo();
   e.setSsn(4);
   e.setEmpage(30);
   e.setEmpname("xyz");
   System.out.println("Employee ssn: "+e.getSsn());
   System.out.println("Employee name: "+e.getEmpname());
   System.out.println("Employee age: "+e.getEmpage());
	}

}

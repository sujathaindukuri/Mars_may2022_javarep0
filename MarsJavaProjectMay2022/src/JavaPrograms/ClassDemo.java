package JavaPrograms;

public class ClassDemo {
	String name;
	int no;
	static String department;
	public static void main(String args[])
	{
	ClassDemo c1=new ClassDemo();	
	ClassDemo c2=new ClassDemo();
	ClassDemo c3=new ClassDemo();
	c1.name="sujatha";
	c2.name="Indukuri";
	c1.no=1;
	c2.no=2;
	c1.department="hr";
	c2.department="fin";
	c3.department="sales";
	
	System.out.println(c1.no);
	System.out.println(c1.name);
	System.out.println(c2.no);
	System.out.println(c2.name);
	System.out.println("static department variable "+c1.department);
	System.out.println("static department variable "+c2.department);
	System.out.println("static department variable "+c3.department);
	
	
	}
	
		
	

}

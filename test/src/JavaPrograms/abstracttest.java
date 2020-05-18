package JavaPrograms;

 abstract class testabstract
{
	
	 public abstract void test1(); // body of the method need to be implemented in the inherited class
	 
	 public void test2() {
		 System.out.println("Non Abstract method");
	}
}


public class abstracttest extends testabstract   {
	 public void test1() {
		 System.out.println("Abstract method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testabstract ta = new testabstract();// cannot instantiate testabstract
		abstracttest at = new abstracttest();
		at.test1();
		at.test2();
	}

}

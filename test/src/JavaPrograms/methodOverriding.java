 package JavaPrograms;

 class parentmethod
{
	
	public void m1()
	{
		System.out.print("parent" );
	}
	
	
}


public class methodOverriding extends parentmethod {
	
	public void m1()
	{
		System.out.print("child " );
	}
	
	public void m2()
	{
		this.m1(); // to call method of its own class
		super.m1(); // to call method of parent class
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverriding mo =  new methodOverriding();
		mo.m1();
		mo.m2();
				
			parentmethod p1 = new 	methodOverriding();
			p1.m1();
			
		;
			
	}

}

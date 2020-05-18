package JavaPrograms;


interface book
{
	void test();
	public void test1();

}


public class interfacetest  implements book {

	public void test()
	{
		System.out.println("imterface testing");
	}
	
	public void test1()
	{
		System.out.println("imterface testing1");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interfacetest it =  new interfacetest();
		it.test();
		it.test1();
		

	}

}

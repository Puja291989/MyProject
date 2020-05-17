package JavaPrograms;

public class constructorOverload {
	
	
	public constructorOverload()
	{
		System.out.println("Constructor without parameter");
	}
	
	public constructorOverload(int x)
	
	{
		
		System.out.println("Constructor with 1 parameter"+ x*x);
	}
	
public constructorOverload(int x , int y )
{
	System.out.println("Constructor with 2 parameter"+ x*y);	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructorOverload cl =  new constructorOverload();
		constructorOverload c2 =  new constructorOverload(12);
		
		constructorOverload c3 =  new constructorOverload(12, 2);
	}

}

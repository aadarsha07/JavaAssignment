interface DefultInterface{
	//abstract method
	public void square(int a);

	 //defult method
	default void show()
	{
		System.out.println("Defult Method Executed");
	}
}

class TestClass implements DefultInterface
{
	// implement of square abstract method 
	public void square (int a)
	{
		System.out.println(a*a);
	}

	public static void main(String[] args)
	{
		TestClass d= new TestClass();
		d.square(5);
		d.show();
	}
}
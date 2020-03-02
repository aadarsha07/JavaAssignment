class MyException extends Exception
{
	public MyException(string s)
	{
		//Call constructor of parent exception
		super(s);
	}
}
 public class VirtualMachineError{
 	//Driver program
 	public static void main(String[] args)
 	{
 		try
 		{
 			//throw an object of user defined exception
 			throw new MyException("Aadarsha Baral");
 		}
 		catch (MyException e)
 		{
 			System.out.println("Caught");

 			System.out.println(e.getMessage());
 		}
 	}
 }

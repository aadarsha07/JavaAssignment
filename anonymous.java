class Test{
	public static void main(String[] args)
	{
		//anonymous array
		sum(new int[] { 1,3,4});
	}
	public static void sum(int[] a)
	{
		int total =0;
		//using for each loop
		for (int i:a)
			total = total +i;
		System.out.println("The sum is:"+ total);
	}
}

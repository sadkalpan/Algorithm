class OtuzDort {
	public static void main(String args[]) throws Exception
	{
		int i ;
		int a[] = new int[5];
		
		for (i = 0; i < 5; i = i + 1)
		a[i] = (i + 1) * 2;
		
		for (i = 0; i < 5; i = i + 1)
			System.out.println(a[i]);
	}
} 
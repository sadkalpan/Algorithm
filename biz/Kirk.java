class Kirk {
	public static void main(String args[]) throws Exception
	{
		int i, n;
		System.out.print("n gir : ");
		n = Keyboard.readInt();		

		int a[] = {4, 8, 3, 1, 18, 9, 21,20, 5, 17};
		
		for (i = 0; i < 10; i = i + 1)
		if (n > a[i])
		System.out.println(a[i]);
	}
}
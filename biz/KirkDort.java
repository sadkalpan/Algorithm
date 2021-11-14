class KirkDort {
	public static void main(String args[])  throws Exception
	{
		int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, n;

		System.out.print("n gir : ");
		n = Keyboard.readInt();
		
		for (i = 0; i < n ; i = i + 1)
			System.out.println(a[i]);
	}
}
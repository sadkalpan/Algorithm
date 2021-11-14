class YetmisBes {
	public static void main(String args[]) throws Exception
	{
		int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, k, size, n;
		size = 10;
		
		System.out.print("n gir : ");
		n = Keyboard.readInt();		

		for (k = 1 ; k <= n; k = k + 1){		

		for (i = 1; i <= n - k ; i = i + 1)
		System.out.print(" ");

		for (i = 1; i <= k ; i = i + 1)
		System.out.print("*");
		System.out.println();
		}
	}
}
	
			
		
		
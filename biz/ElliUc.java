class ElliDort {
	public static void main(String args[]) throws Exception
	{ 
		int b[] = new int[10];
		int a[]  = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, size, n;
		size = 10;
		
		System.out.print("n gir : ");
		n = Keyboard.readInt();
	

		for (i = 0; i <= n; i = i + 1) 
			b[size - 1 - i] = a[n - i];
		
		for (i = 0; i < size - n; i = i = i + 1)
			b[i] = 0;
	
		for (i = 0; i < size; i = i + 1)
		System.out.println(b[i]);

		}
}
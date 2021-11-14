class YetmisYedi {
	public static void main(String args[]) throws Exception
	{
		int i, k, n;
		
		System.out.print("n gir : ");
		n = Keyboard.readInt();		

		for (k = 1 ; k <= n; k = k + 2){		

		for (i = n; i > k ; i = i - 2)
		System.out.print(" ");

		for (i = 1; i < i + 1 ; i++)
		System.out.print("*");
		System.out.println("");
		}
	}
}
	
			
		
		
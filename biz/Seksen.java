class Seksen {
	public static void main(String args[]) throws Exception
	{
		int i, k, n;
		
		System.out.print("n gir : ");
		n = Keyboard.readInt();		

		for (i = 1 ; i <= n; i = i + 1){
					
			if (i == 1)
			for (k = 1 ;k <= n ; k = k + 1)
			System.out.print("*");
			else 
				if (i == n)
				for (k = 1 ;k <= n ; k = k + 1)
				System.out.print("*");
				else {
				System.out.print("*");
				for (k = 1 ;k <= n - 2 ; k = k + 1)
				System.out.print(" ");
			 	System.out.print("*");
				}
				System.out.println();
		}
	}
}
	
			
		
		
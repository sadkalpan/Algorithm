class YuzOnBir {	
	public static void main(String args[]) throws Exception
	{
		
		int a[] = { 1, 2, 3};  
		int i, size, n;
		size = 3;
		
		
	
		i = 0;
		while (i != size){
			System.out.print("bir sayi gir : ");
			n = Keyboard.readInt();
			if (n == a[i])
			i = i + 1;	
			
			else 
			if (a[0] == n)
			i = 1;	
			else
			i = 0;
	}
	}
}
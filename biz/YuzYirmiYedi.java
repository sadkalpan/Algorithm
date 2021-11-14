class YuzYirmiYedi {
	public static void main (String args[]) throws Exception
	{
		//	   0   1   2   3   4   5   6   7   8  9
		int a[] = { 1, 1, 1, 3, 5, 5, 8, 9, 17, 17, 17, 17, 20, 24, 24 };
		int b[] = new int[14];
		int i, k;

		b[0] = a[0];
		
		for(i = 0; i <= 14; i = i + 1)
		if(a[i] != a[i+1])
		k = 0;
		while(k < 15)
		k+1;
		b[k] = a[i+1];

		


		}
	}			
			
			
				
				
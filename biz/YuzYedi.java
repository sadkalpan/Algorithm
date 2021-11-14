class YuzYedi {
	public static void main(String args[]) throws Exception
	{
		int a[] = new int[10];
		int n, digit, p, i, k, newn, temp;
		p = 0;
		System.out.print(" n gir : ");
		n = Keyboard.readInt();

		while (n != 0) {
		digit = n % 10;
		a[p] = digit;
		p = p + 1;
		n = n / 10;
	}
		
		for (i = 0; i < p  ; i = i + 1)
			for (k = 0; k < p - 1 - i; k = k + 1)
			if (a[k] < a[k + 1]){
			temp = a[k];
			a[k] = a[k + 1];
			a[k + 1] = temp;
			System.out.println();
		}
		newn = a[0];
		for (i = 1; i < p; i = i + 1)
		newn = (10 * newn) + a[i];
		System.out.println(newn);
	
	}
}
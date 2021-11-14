class YuzAlti {
	public static void main(String args[]) throws Exception
	{
		int a[] = new int[10];
		int n, digit, p, newn, i;
		p = 0;
		newn = 0;
		System.out.print(" n gir : ");
		n = Keyboard.readInt();

		while (n != 0) {
		digit = n % 10;
		newn = (10 * newn) + digit;
		n = n / 10;
		a[5] = newn;
	}
		for (i = 0; i < 10 ; i = i + 1)
		System.out.println(a[i]);
		
	}
}
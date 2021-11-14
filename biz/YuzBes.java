class YuzBes {
	public static void main(String args[]) throws Exception
	{
		int a[] = new int[10];
		int n, digit, p, i;
		p = 0;
		System.out.print(" n gir : ");
		n = Keyboard.readInt();

		while (n != 0) {
		digit = n % 10;
		a[p] = digit;
		p = p + 1;
		n = n / 10;
	}
		for (i = 0; i < 10; i = i + 1)
		System.out.print(a[i]);
		
	}
}
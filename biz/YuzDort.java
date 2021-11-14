class YuzDort {
	public static void main(String args[]) throws Exception
	{
		int n, digit;

		System.out.print(" n gir : ");
		n = Keyboard.readInt();

		while (n != 0) {
		digit = n % 10;
		System.out.println(digit);
		n = n / 10;
	}
		
		
		
	}
}
class YirmiAlti {
	public static void main(String args[]) throws Exception
	{
		int a, b, i;
		
		System.out.print("a gir : ");
		a = Keyboard.readInt();
		
		System.out.print("b gir : ");
		b = Keyboard.readInt();

		for (i = a + 1 ; i < b; i = i + 1)
			if (i % 5 == 0)
				System.out.println(i);
	}
}
			
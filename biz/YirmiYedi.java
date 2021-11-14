class YirmiYedi {
	public static void main(String args[]) throws Exception
	{
		int i, a, b;

		System.out.print("a gir : ");
		a = Keyboard.readInt();
		
		System.out.print("b gir : ");
		b = Keyboard.readInt();
	
		for (i = a + (5 - a % 5); i < b;i = i + 5)
			System.out.println(i);
	}
}

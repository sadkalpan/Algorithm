class YirmiDort {
	public static void main(String args[])  throws Exception
	{
		int i, a, b;
		System.out.print("a gir : ");
		a = Keyboard.readInt();
		
		System.out.print("b gir : ");
		b = Keyboard.readInt();

		if ( a > b )
			for (i = b; i <= a; i = i + 1)
			System.out.println(i);
		else
			if (b != a)
			for (i = a; i <= b; i = i + 1)
			System.out.println(i);
			else
				for (i = a; i == b; i = i + 1 )
				System.out.println(i);
	}
}
class YirmiUc {
	public static void main(String args[])  throws Exception
	{
		int i, a, b;
		System.out.print("bir a gir : ");
		a = Keyboard.readInt();
		
		System.out.print("bir b gir : ");
		b = Keyboard.readInt();

		for ( i = a; i <= b; i = i + 1)
		System.out.println(i);
	}
}
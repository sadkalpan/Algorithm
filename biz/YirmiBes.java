class YirmiBes {
	public static void main(String args[]) throws Exception
	{
		int i, n;

		System.out.print("n gir : ");
		n = Keyboard.readInt();

		for (i = n % 2 + 2; i <= n; i = i + 2)
			System.out.println(i);
	}
}
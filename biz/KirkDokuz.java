class KirkDokuz {
	public static void main(String args[]) throws Exception
	{ 
		int a[]  = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, size, n;
		size = 10;
		
		System.out.print("n gir : ");
		n = Keyboard.readInt();

		for (i = size - n; i < size; i = i + 1)
			System.out.print(a[i] + " ");
	}
}
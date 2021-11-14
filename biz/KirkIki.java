class KirkIki {
	public static void main(String args[]) throws Exception
	{
		int i, size, x, y;
		size = 10;
		System.out.print("x gir : ");
		x = Keyboard.readInt();	
		System.out.print("y gir : ");
		y = Keyboard.readInt();	
				

		int a[] = {4, 8, 3, 1, 18, 9, 21,20, 5, 17};

		for (i = 0; i < size; i = i + 1)
		if (x > a[i])
			System.out.println("x den kucuk : " + a[i]);
		else if (y < a[i])
			System.out.println("y den buyuk : " + a[i]);
	}
}
			
class OtuzYedi {
	public static void main(String args[]) throws Exception
	{
		int i, size;
		size = 10;
		int a[] = {4, 8, 3, 1, 18, 9, 21,20, 5, 17};
		
		for (i = 0; i < size; i = i + 1)
			if (a[i] % 2 != 0)
			System.out.println(a[i]);
	}
}
		
class AltmisDort {
	public static void main(String args[]) throws Exception
	{
		int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, size, max;
		size = 10;
		
		max = a[0];
		
		for (i = 1;i < size; i = i + 1)
			if (a[i] > max)
			max = a[i];
		
		System.out.println(max);
	}
}
class YuzOn {
	public static void main(String args[]) throws Exception
	{
		int a[] = { 4, 8, - 3, - 1, 18, 9, - 21, 20, 5, - 17}; 
		int i, size, maxNeg;
		size = 10;
		i = 0;

		while (a[i] >= 0)
		i = i + 1;
		maxNeg = a[i];
		
		for (i = i + 1; i < size; i = i + 1)
			if (a[i] < 0)
			if (a[i] > maxNeg)
			maxNeg = a[i];
			System.out.println(maxNeg);
	}
}
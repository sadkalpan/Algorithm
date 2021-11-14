class AltmisSekiz {
	public static void main(String args[]) throws Exception
	{
		int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int i, size, max, p;
		size = 10;
		p = 0;
		max = a[0];
		
		for (i = 1;i < size; i = i + 1)
			if (a[i] > max){
			max = a[i];
			p = i;
		}
		
		System.out.println(max);
		System.out.println(p);
	}
}
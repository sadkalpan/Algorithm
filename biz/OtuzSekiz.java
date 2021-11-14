class OtuzSekiz {
	public static void main(String args[]) throws Exception
	{
		int i, size, count;
		size = 10;
		count = 0;
		int a[] = {4, 8, 3, 1, 18, 9, 21,20, 5, 17};

		for (i = 0; i < size; i = i + 1)
			if (a[i] % 2 != 0 ){
			count = count + 1;
			System.out.println(a[i]);}

				System.out.println("aded : " + count);
	}
}
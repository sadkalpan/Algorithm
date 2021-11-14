class ElliSekiz {
	public static void main(String args[]) throws Exception
		{
			int b[] = new int[10];
			int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

			int i, size;
			size = 10;
		
			for (i = 0;  i < size; i = i + 1)
				b[size - 1 - i] = a[i];

			for (i = 0;  i < size; i = i + 1)
				System.out.println("cevap : " + b[i]);
	}
}
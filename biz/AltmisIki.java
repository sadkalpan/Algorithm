class AltmisIki {
	public static void main(String args[]) throws Exception
		{
			int b[] = new int[10];
			int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

			int i, size, p;
			size = 10;
			p = 0;

			for (i = 0;  i < size; i = i + 1)
				if (a[i] % 2 != 0){
				b[p] = a[i];
				p = p + 1;
			}

			for (i = 0; i < size; i = i + 1)
				if (a[i] % 2 == 0){
				b[p] = a[i];
				p = p + 1;
			}


			for (i = 0;  i < size; i = i + 1)
				System.out.println("cevap : " + b[i]);
	}
}
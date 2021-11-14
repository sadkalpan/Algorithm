class YuzOnDort {	
	public static void main(String args[]) throws Exception
	{
		int a[] ={ 5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};

		int i, n , size, flag;
		size = 20;

		System.out.print("bir sayi gir : ");
		n = Keyboard.readInt();

		flag =0;
		
		for (i = 0; i < n;i = i + 1)
			if (a[i] == n)
			flag = 1;

		if (flag == 1)
			System.out.println(n + " rakamindan  "+" var");

		else
			System.out.println(n + " rakamindan "+" yok");
	}
}
	
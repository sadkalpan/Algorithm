class YuzOnIki {	
	public static void main(String args[]) throws Exception
	{
		int a[] ={ 5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};

		int i, n , size, count;
		size = 20;
		count = 0;

		System.out.print("bir sayi gir : ");
		n = Keyboard.readInt();

		for (i = 0; i < size;i = i + 1)
			if (a[i] == n)
			count = count + 1;
			System.out.println(n + " rakamindan  " + count + "  tane var");
	
	}
}
	
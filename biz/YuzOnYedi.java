class YuzOnYedi {	
	public static void main(String args[]) throws Exception
	{
		int a[] ={ 5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};

		int i, k , size, flag;
		size = 20;
		
		for (i = 0; i < size;i = i + 1){
			flag = 0;
			for (k = 0; k < i; k = k + 1)
			if (a[k] == a[i])
			flag = 1;

		if (flag == 0)
			System.out.println(i + " Kendinden once  " + " yok");

	}
	}
}
	
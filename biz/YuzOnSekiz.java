class YuzOnSekiz {	
	public static void main(String args[]) throws Exception
	{
		int a[] ={ 4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		int b[] ={ 8 , 13, 6, 12, 4, 19, 1, 14, 25};
		int i, k , size, flag;

		size = 10;

		for (i = 0; i < size;i = i + 1){
			flag = 0;
			for (k = 0; k < size; k = k + 1)
			if (a[i] == b[k])
			flag = 1;

		if (flag == 1)
			System.out.println(a[i] + " ortak sayi  ");

	}
	}
}
	
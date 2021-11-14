class OtuzDokuz {
	public static void main(String args[]) throws Exception
	{
		int i, size, count, sum, avg;
		size = 10;
		count = 0;
		sum = 0;
		int a[] = {4, 8, 3, 1, 18, 9, 21,20, 5, 17};
		
		for (i = 0; i < size; i = i + 1)
			if (a[i] % 2 != 0){
			System.out.println(a[i]);
 			count = count + 1;
			sum = sum + a[i];
	}
			avg = sum / count;
		
			System.out.println("avg : " + avg);
			System.out.println("tek sayi toplam : " + sum);
			System.out.println("tek sayi aded :  " + count);
	}
}
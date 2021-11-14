class KirkBir {
	public static void main(String args[]) throws Exception
	{
		int i, n, size, countOdd, countEven, sumOdd, sumEven;
		countOdd = 0;
		countEven = 0;
		sumOdd = 0;
		sumEven = 0;
		size = 10;
		System.out.print("n gir : ");
		n = Keyboard.readInt();		

		int a[] = {4, 8, 3, 1, 18, 9, 21,20, 5, 17};
		
		for (i = 0; i < size; i = i + 1)
			if (n > a[i])
				if (a[i] % 2 != 0){
				sumOdd = sumOdd + a[i];
				countOdd = countOdd + 1;
	}
		else {
			sumEven = sumEven + a[i];
			countEven = countEven + 1;
	}
			System.out.println("sumOdd : " + sumOdd);
			System.out.println("sumEven : " + sumEven);
			System.out.println("countOdd : " + countOdd);
			System.out.println("countEven : " + countEven);
	}
}
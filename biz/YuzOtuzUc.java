class YuzOtuzUc {
	public static void main(String args[]) throws Exception
		{
	int a[] = {1, 1, 1, 3, 5, 5, 8, 9, 17, 17, 17, 17, 20, 24, 24};
	int i, tempCount, size, maxCount, p, n;
	
	size = 15;
	tempCount = 1;
	maxCount = 1;
	n =a[0];

	for(i = 1; i < size; i = i + 1)
	if(a[i] == a[i-1])
	tempCount = tempCount + 1;
	
	else{
	if(tempCount > maxCount){
	maxCount = tempCount;
	n = a[i-1];
		}
	tempCount = 1;	
		}
	System.out.print("en cok tekrar eden sayi : "+ n + "  aded : " + maxCount );
		

	}
}	
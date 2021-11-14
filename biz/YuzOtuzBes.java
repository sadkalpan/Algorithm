class YuzOtuzBes {
	public static void main(String args[]) throws Exception
		{
	//	   0  1  2  3   4  5   6   7  8   9
	int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
 	
	int i, size, avg, sum, temp, mindiff, n;
	sum = 0;
	size = 10;
	
	for(i = 0; i < size ;i = i + 1) 
	sum = sum + a[i];
	avg = sum / size;

	n = a[0];
	mindiff = avg - a[0];
	
	if(mindiff < 0)
	mindiff = -mindiff;
	
	for(i = 1; i < size ;i = i + 1){
	temp =avg - a[i];
	if(temp < 0)
	temp = -temp;
	
	if(mindiff > temp){
	mindiff = temp;
	n = a[i];
	}
	 }
	System.out.print("averaja en yakin sayi : " + n);
	

	}

}
	
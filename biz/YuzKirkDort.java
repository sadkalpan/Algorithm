class YuzKirkDort {
	public static void main(String args[]) throws Exception
		{
	int a[] = {0, 0, 0};
	java.util.Random generator = new java.util.Random();
	int n, size, i, flag, count;
	double win, total, ratio;
	size = 3;
	
	size= 3;		
	count = 0;
	while(count != size)
	for(i = 0; i < count; i = i + 1){
	n = generator.nextInt(90) + 1;	
	
	if(a[i] == n)
	flag = 1;
	
	if(flag == 0){
	a[count] = n;
	count = count + 1;
		}
		}

	System.out.print();
	


		}
}
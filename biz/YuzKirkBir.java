class YuzKirkIki {
	public static void main(String args[]) throws Exception
		{
		
	int a[] = new int[6];	
	java.util.Random generator = new java.util.Random();
	
	int i, size, flag, n, count;
	size = 6;
	count = 0;
	
	a[0] = generator.nextInt(10);
	count = 0;
	
	while(count != size){
	flag = 0;
	n= generator.nextInt(10);
	for(i=0; i < count; i = i + 1)
	if(a[i] == n)
	flag = 1;

	if( flag == 0)
	a[count] = n;
	count = count + 1;
	}
	
	for(i = 0; i < size; i = i + 1)
	System.out.print(a[i] + " ");
	


		}
}
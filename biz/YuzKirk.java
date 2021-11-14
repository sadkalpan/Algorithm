class YuzKirk {
	public static void main(String args[]) throws Exception
		{
	int a[] = {4 , 8, 3, 1, 18, 9, 21, 20, 5, 17};	
	 
	java.util.Random generator = new java.util.Random();
	
	int i, size;
	size = 10;
	
	for(i = 0; i <= 1000 ; i = i + 1){
	a[i] = generator.nextInt(size);
	a[i] = generator.nextInt(size);
	System.out.print(a[i] + " ");}
	
		}
}
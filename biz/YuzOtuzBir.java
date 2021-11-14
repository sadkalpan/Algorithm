class YuzOtuzBir {
	public static void main(String args[]) throws Exception
		{
	int a[] = {17, 1, 1, 5, 3, 9, 5 , 17, 24, 8, 20, 17, 17, 24, 17};
	int i, k, size, p, flag;
	
	size = 15;
	p = 1;

	for(i = 1; i < size; i = i + 1) {
		flag = 0;
		for(k = 0; k < i; k = k + 1)
		if(a[i] == a[k])
		flag = 1;

		if(flag == 0){
		a[p] = a[i];
		p = p + 1;
			}
				}
		for(i = p; i < size ;i = i + 1)
		a[i] = 0;
		
		for(i = 0; i < size ;i = i + 1)
		System.out.print(a[i] +  " ");

		}
}
	
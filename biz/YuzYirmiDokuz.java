class YuzYirmiDokuz {
	public static void main(String args[]) throws Exception
		{
	int a[] = { 1, 1, 1, 3, 5, 5, 8, 9, 17, 17, 17, 17, 20, 24, 24};
	int i, k, size, p, flag;
	size = 15;
	p = 1;	

	for(i=1; i < size; i = i + 1){
	flag = 0;	
	for(k = 0; k < i; k = k + 1)
		if(a[i] == a[k])
		flag = 1;

		if(flag == 0){
		a[p] = a[i];
		p = p + 1;
		}
				}
	for(i = p; i < size ; i = i + 1)
	a[i] = 0;

	for(i = 0; i < size; i = i + 1)
	System.out.print(a[i] + " ");

	}
}
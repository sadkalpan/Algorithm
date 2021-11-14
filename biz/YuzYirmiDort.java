class YuzYirmiDort {
	public static void main(String args[]) throws Exception
		{
		int a[] = { 1, 5, 12, 15, 19, 28, 35, 46, 60, 0};
	int i, n, size, k;
	size = 10;
	
	System.out.print("bir sayi gir : ");
	n = Keyboard.readInt();
	
	if(n >= a[size-2])
	a[size - 1] = n;
	
	else{
	i = 0;
	while(n >= a[i])
	i = i + 1;
	
	for(k = size-2; k >= i; k = k - 1)
		a[k+1] = a[k];
		a[i] = n;
		}
	for(i = 0; i < size; i = i + 1)
		System.out.print(a[i] + " ");

		}
}
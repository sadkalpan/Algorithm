class YuzYirmiBes {
	public static void main(String args[]) throws Exception
		{
		int a[] = { 1, 5, 12, 15, 19, 28, 35, 46, 60, 0};
	int i, size, temp;
	size = 10;
	
	System.out.print("bir sayi gir : ");
	a[size-1] = Keyboard.readInt();
	
	
	for(i = size-2; i >= 0; i = i - 1)
	if(a[i] >= a[i+1]){
	temp = a[i];
	a[i] = a[i + 1];
	a[i+1] = temp;
	}
	

	for(i=0; i < size; i = i + 1)
	System.out.print(a[i] + " ");
	}
}
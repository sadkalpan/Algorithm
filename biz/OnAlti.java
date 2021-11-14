class OnAlti {
	public static void main(String args[]) throws Exception
	{

		int a, b, c, max;
		System.out.print("Bir a giriniz : ");
		a = Keyboard.readInt();
		System.out.print("Bir b giriniz : ");
		b = Keyboard.readInt();
		System.out.print("Bir c giriniz : ");
		c = Keyboard.readInt();
		
		
		max = a;
		if ( b > a)
			max = b;
		
		if ( c > a )
			max = c;
		
		System.out.print("max : " + c );		
				
	}
}
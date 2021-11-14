class OnDort {
	public static void main(String args[]) throws Exception 
	{
		int a, b, c;
		System.out.print("Bir a giriniz : ");
		a = Keyboard.readInt();
		System.out.print("Bir b giriniz : ");
		b = Keyboard.readInt();
		System.out.print("Bir c giriniz : ");
		c = Keyboard.readInt();

		if ( a == b )
			if ( b == c )
				System.out.print("Bir eskenar ucgen");
			else
				System.out.print("Bir eskenar ucgen degil");
		else
			System.out.print("Bir eskenar ucgen degil");
	}
}
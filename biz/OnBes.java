class OnBes {
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
			if ( a != c)
				System.out.print("Ikizkenar");
			else
				System.out.print("Ikizkenar degil");
		else
			if ( b == c )
				System.out.print("Ikizkenar");

			else
				System.out.print("Ikizkenar degil");
	}
}
class OnUc {
	public static void main(String args[]) throws Exception
	{

		int a, b, c;
		System.out.print("Bir a giriniz : ");
		a = Keyboard.readInt();
		System.out.print("Bir b giriniz : ");
		b = Keyboard.readInt();
		System.out.print("Bir c giriniz : ");
		c = Keyboard.readInt(); 

		if ( a + b > c)
			if ( a + c > b)
				if ( c + b > a)
					System.out.println("Bir ucgen ");
				else
					System.out.print("ucgen degil ");
			else
				System.out.print("ucgen degil");
		else
			System.out.print("ucgen degil");
	}
}
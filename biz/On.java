class On {
	public static void main(String args[]) throws Exception
	{
		int n;
		System.out.print("Sayi giriniz : ");
		n = Keyboard.readInt();

		if (n < 100)
			if (n > 0)
				System.out.println("Sayi 0 ile 100 un arsında");
			else
				System.out.println("Sayi 0 ile 100 un arsında degil");
		else
			System.out.println("Sayi 0 ile 100 un arsinda degil");
	}
}	
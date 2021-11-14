class OnBir {
	public static void main(String args[]) throws Exception
	{
		int a;
		System.out.print("Bir sayi giriniz : ");
		a = Keyboard.readInt();

		if (a > 100)
			System.out.print("Sayi 3 basamakli");
		else
			if (a >10)
				System.out.println("sayi iki basamakli");
			else
				System.out.println("sayi bir basamakli");
	}
}
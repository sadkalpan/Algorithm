class Uc {
	public static void main(String args[]) throws Exception
	{
		System.out.print("Bir sayi giriniz : ");
		int a;
		a = Keyboard.readInt();		


		if (a % 2 == 0 )
			System.out.println("Sayi cift");
		else
			System.out.println("Sayi tek");
	}
}
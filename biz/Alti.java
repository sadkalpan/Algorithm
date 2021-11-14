class Alti {
	public static void main(String args[]) throws Exception
	{

		int a;
		System.out.print("Birinci sayiyi giriniz : ");
		a = Keyboard.readInt();
		
		if (a < 0)
			a = a * -1;
			System.out.println("Sayi : " + a);
	}
}
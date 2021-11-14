class Bes {
	public static void main(String args[])  throws Exception
	{

		int a, b;
		System.out.print("Birinci sayiyi giriniz : ");
		a = Keyboard.readInt();
		System.out.print("Ikinci sayiyi giriniz : ");
		b = Keyboard.readInt();
		
		if (a % b == 0)
			System.out.println("Birinci sayi iknci sayinin tam kati : " + a);

		else
			System.out.println("Birnci sayi ikinci sayinin tam kati degil : " + b);
	}
}
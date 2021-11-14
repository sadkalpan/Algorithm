class Sekiz {
	public static void main(String args[]) throws Exception
	{

		int a, b;

		System.out.print("Birinci sayiyi giriniz : ");
		a = Keyboard.readInt();
		System.out.print("Ikinci sayiyi giriniz : ");
		b = Keyboard.readInt(); 

		if (a != b)
			if(a > b)
				System.out.println("Birinci sayi ikinci sayidan buyuk");
			else
				System.out.println("Birinci sayi ikinci sayidan kucuk ");

		else
			System.out.println("Birinci sayi ikinci sayiya esit ");
	}
}
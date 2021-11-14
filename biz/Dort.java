class Dort {
	public static void main (String args[])  throws Exception
	{

		int a, b;
		System.out.print("Birinci sayiyi giriniz : ");
		a = Keyboard.readInt();
		System.out.print("Ikinci sayiyi giriniz : ");
		b = Keyboard.readInt();

		if (a > b)
			System.out.println("Birinci sayi buyuk : " + a);
		else
			System.out.println("Ikinci sayi daha buyuk : " + b);
	}
}		
class Sekiz {
	public static void main(String args[]) throws Exception
	{

		int a, b;

		int a;("Birinci sayiyi giriniz : ");
		System.out.print(Birinci sayiyi yaziniz : );
		a = Keyboard.readInt();
		System.out.print("Ikinci sayiyi giriniz : ");
		b = Keyboard.readInt(); 

		if (a != b)
			if(a > b)
				System.out.println("a b den buyuk");
			else
				System.out.println("a b den kucuk ");

		else
			System.out.println("a b ye esit ");
	}
}
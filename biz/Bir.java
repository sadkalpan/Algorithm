class Bir {
	public static void main(String args[])	throws Exception
	{
		int a, b, c, sonuc;

		System.out.print("bir sayi giriniz : ");
		a = Keyboard.readInt();
		b = a / 10;
		c= a % 10;

		sonuc = b * b + c * c;
		System.out.println("Sonuc : " + sonuc);
	}
}
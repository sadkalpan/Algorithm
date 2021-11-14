class Yedi {
	public static void main(String args[]) throws Exception
	{

		int x, y, z;
 
		System.out.print("Bir sayi giriniz : ");
		x = Keyboard.readInt();
		
		if (x < 0){
			y = x * x + 2 * x;
			z = 3 * x;
	}
		else {
			y = x;
			z = x * x + 10;
	}

		System.out.println("y : " + y + " z : " + z);
	}
}
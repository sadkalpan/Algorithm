class OnIki {
	public static void main(String args[]) throws Exception
	{
		int x, y, k, t;
		System.out.print("Bir sayi gir : ");
		x = Keyboard.readInt();

		if (x < 0){
			k = 2;
			t = 4;
	}
		else
			if (x <= 5){
				k = 2;
				t = 4; 
	}
			else{
				k = 5;
				t = 2;
	}
		y = x + 2 * k + t;
			System.out.println("sonuc = " + y);
	}
}
			
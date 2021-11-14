class AreaRect {
	public static void main(String args[]) throws Exception
	{
		int height, width, area;

		// Yükseklik ve gneişlği girniz
		System.out.print("Yuksekligi giriniz = ");
		height = Keyboard.readInt();
		System.out.print("Genisligi giriniz = ");
		width = Keyboard.readInt();

		area = height * width;
		System.out.println("Dikdortgenin alani = " + area );
	}
} 
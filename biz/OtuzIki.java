class OtuzIki {
	public static void main(String args[]) throws Exception
	{
		int n, i, sum;
		System.out.print("n gir : ");
		n = Keyboard.readInt();
		sum = 0;

		for (i =1; i < n; i = i + 1)
		sum = sum + i;
		System.out.print(sum);
	}
}

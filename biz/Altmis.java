class Altmis {
	public static void main(String args[]) throws Exception
		{
			int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

			int i, size, temp, s, n;
			size = 10;
			
			System.out.println("s gir : " + " ");
			s = Keyboard.readInt();

			
			System.out.println("n gir : ");
			n = Keyboard.readInt();

			for (i = 0;  i < n / 2; i = i + 1){
				temp = a[s + i];
				a[s + i] = a[s + n - i];
				a[s + n - i] = temp;
	}

			for (i = 0;  i < size; i = i + 1)
				System.out.println("cevap : " + a[i]);
	}
}
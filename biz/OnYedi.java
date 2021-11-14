class OnYedi {
	public static void main(String args[])  throws Exception 
	{
		int n;
		System.out.print("n : ");
		n = Keyboard.readInt(); 
		
		if (n > 80)
			System.out.println("a");
		else
			if (n > 60)
				System.out.println("b");
			else
				if ( n > 40)
					System.out.println("c");
				else
					if ( n > 20)
						System.out.println("d");
					else
						System.out.println("e");
	}
}
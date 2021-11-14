class DoksanDokuz {
	public static void main(String args[])throws Exception
	{
		int m[][] = new int[5][5];
		
		int i, k, row, col, count;
		row = 5;
		col = 5;
		count = 0;

		for (i = 0; i < row;i = i + 1)
			for (k = col - 1 - i; k <= col ; k = k + 1){
			count = count + 1;
			m[i][k] = count;
		}
		for (i = 0; i < row;i = i + 1){
			System.out.println(" ");
			for (k = 0; k < col; k = k + 1)
			System.out.print(m[i][k] + " ");
		}
	}
}
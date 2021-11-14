class SeksenUc {
	public static void main(String args[])throws Exception
	{
		int m[][] =new int[4][3];
		int i, k, row, col, count;
		count = 0;
		row = 4;
		col = 3;

		for (i = 0; i < col;i = i + 1)
			for (k = 0; k < row; k = k + 1){
			count = count + 1;
			m[k][i] = count;
	}

		for (i = 0; i < row;i = i + 1){
			System.out.println(" ");
			for (k = 0; k < col; k = k + 1)
			System.out.print(m[i][k] + " ");
		}
	}
}
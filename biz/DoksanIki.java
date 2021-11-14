class DoksanIki {
	public static void main(String args[])throws Exception
	{
		int m[][] ={{ 5, 7, 3},
			    { 15, 6, 10},
			    { 22, 9, 1},
			    { 11, 14, 18}};
		int i, k, row, col, max, count, sum;
		row = 4;
		col = 3;
		max = m[0][0];
		count = 0;
		sum = 0;
		for (i = 1; i < row;i = i + 1)
			count = count + 1;
			for (k = 0; k < col; k = k + 1)

			if (max < m[i][k])
			max = m[i][k];
			
			
			System.out.println(max);
			System.out.println(k);
	}
}
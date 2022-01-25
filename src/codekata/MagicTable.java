package codekata;

public class MagicTable {
	public boolean print2D(int series, int[][] array) {
		int[][] a = array;
		int N = series;
		int cols = a[0].length;  
		int colsSum = 0;
		for (int i = 0; i < cols; i++) {
			 
          int colSum = 0;
            for (int j = 0; j < N; j++)
            {
                colSum += a[j][i];
            }
            
            if (colSum != colsSum && i > 0) {
            	
            	return false;
            }
            colsSum = colSum;
        }
 
 
        return true;
		
	}

}

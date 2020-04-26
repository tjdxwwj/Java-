package Matrix;

public class MatrixGenerator{
	// 表示行和列
    private int mRow, mColumn;
    private double [][]Data;
 
    // 构造方法
    public MatrixGenerator(int row, int column) {
        mRow = row;
        mColumn = column;
        Data= new double[mRow ][mColumn];
    }
 
    
    public double[][] getData() {
		return Data;
	}

	private double random() {
        double random1 = Math.random();
        double random2 = random1 * 20; // 0.0 - 20.0
        return  random2;
    }
 
    // 创建矩阵
    public void createMatrix() {

        for (int i = 0; i < mRow; i++) {
        	  for (int j = 0; j < mColumn; j++) 
        		  	{
        		  		Data[i][j]=random();
        		  	}
        }
    }
 
    public double getMatrix(int row, int col) {
    	 
        return Data[row ][col] ;
 
    }

    public int getmRow() {
		return mRow;
	}


	public int getmColumn() {
		return mColumn;
	}
	
	public void setMatrix(int row , int col, double value) {
		  
	       this.Data[row][col] = value;
	 
	 }
	public void print()
	{
		for (int i = 0; i < mRow; i++) {
      	  for (int j = 0; j < mColumn; j++) 
      		  	{
      		  		System.out.print(Data[i][j]+" ");
      		  	}
        	System.out.println();
      }
	}


}

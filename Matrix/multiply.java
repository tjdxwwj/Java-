package Matrix;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class multiply extends Thread{
	
	private MatrixGenerator m1,m2,m;
	private int gap,index;
	private CountDownLatch countDownLatch;

	multiply(MatrixGenerator m1,MatrixGenerator m2,MatrixGenerator m,int gap,int index, CountDownLatch countDownLatch)
	{
		this.m1=m1;
		this.m2=m2;
		this.gap=gap;
		this.index=index;
		this.m=m;
		this.countDownLatch=countDownLatch;
	}
	
	public void run() {
			double temp=0;
			for (int i = index * gap; i < (index + 1) * gap; i++)
			{
				for(int k = 0;k<m2.getmColumn();k++) {
	                for(int j = 0;j<m1.getmColumn();j++)
	                {
	                	temp += m1.getMatrix(i, j) * m2.getMatrix(j, k);
	//                		System.out.println(currentThread().getName()+" "+m1.getMatrix(i, j)+"*"+m2.getMatrix(j, k));
	                }
	             
	                 		 m.setMatrix(i, k, temp);
	                		 temp = 0;    	 
	 
	            }
			}
			countDownLatch.countDown();
		}
	
	
	public static MatrixGenerator multiply_serial(MatrixGenerator m1,MatrixGenerator m2)
	{
		MatrixGenerator m3=new MatrixGenerator(m1.getmRow(),m2.getmColumn());
		double temp=0;
		
		for(int i = 0;i<m3.getmRow();i++) {
			 
            for(int k = 0;k<m2.getmColumn();k++) {
 
                for(int j = 0;j<m1.getmColumn();j++)
 
                    {
                	
                    temp += m1.getMatrix(i, j) * m2.getMatrix(j, k);
//                    System.out.println(m1.getMatrix(i, j)+"*"+m2.getMatrix(j, k));

                    }
 
                m3.setMatrix(i, k, temp);
 
                temp = 0;
 
            }
		}
		
		return m3;
		
	}
	
	public static boolean isEqual(double[][] a, double b[][]) {
		if (a.length != b.length) {
		return false;
		} 
		else {
			for (int i = 0; i < a.length; i++) {
					if (a[i].length != b[i].length) {
						return false;
					} else {
						if (!Arrays.equals(a[i], b[i])) 
							return false;
						}
			}
		}
		return true;
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		long startTime;
		long endTime;
		MatrixGenerator m1=new MatrixGenerator(100,100);
		m1.createMatrix();
		MatrixGenerator m2=new MatrixGenerator(100,100);
		m2.createMatrix();
//		m1.print();
//		System.out.println();
//		m2.print();
//		System.out.println();
	
		//并行
		MatrixGenerator m3=new MatrixGenerator(m1.getmRow(),m2.getmColumn());
		int threadNum=5;
		CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		startTime = System.currentTimeMillis();
		int gap=m1.getmRow()/threadNum;
		for (int i = 0; i < threadNum; i++) {
			multiply ct = new multiply(m1, m2, m3, gap, i,countDownLatch);
			ct.start();
		}
		////调用await()方法的线程会被挂起，它会等待直到count值为0才继续执行
		countDownLatch.await();
		endTime = System.currentTimeMillis();
		System.out.println("并行计算开始时刻:" + (startTime));
		System.out.println("并行计算结束时刻:" + (endTime));
		System.out.println("并行计算运行时间:" + (endTime - startTime));
//		串行
		startTime = System.currentTimeMillis();
		MatrixGenerator m4=multiply_serial(m1,m2);
		endTime = System.currentTimeMillis();
		System.out.println("串行计算开始时刻:" + (startTime));
		System.out.println("串行计算结束时刻:" + (endTime));
		System.out.println("串行计算运行时间:" + (endTime - startTime));
		assert(isEqual(m4.getData(),m3.getData()));
	
	}

}

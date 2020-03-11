package MyComputer;

public class IntelCPU extends CPU{
	
	IntelCPU(double price,int coreNum)
	{
		this.coreNum=coreNum;
		this.price=price;
		this.sign="Intel";
	}
	public void work()
	{
		System.out.print(this.getName()+"work");
	}

}

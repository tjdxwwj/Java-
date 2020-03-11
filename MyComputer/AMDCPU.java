package MyComputer;

public class AMDCPU extends CPU {
	 AMDCPU(double price,int coreNum)
	{
		this.coreNum=coreNum;
		this.price=price;
		this.sign="AMD";
	}
	 public void work()
		{
			System.out.print(this.getName()+"work");
		}

}

package MyComputer;

public class SamsungRAM extends RAM{
	
	SamsungRAM (double price,int volume)
	{
		this.volume=volume;;
		this.price=price;
		this.sign="Samsung";
	}
	
	public void work()
	{
		System.out.print(this.getName()+"work");
	}

}

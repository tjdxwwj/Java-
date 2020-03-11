package MyComputer;

public class KingstonRAM extends RAM {

	KingstonRAM (double price,int volume)
	{
		this.volume=volume;;
		this.price=price;
		this.sign="Kingston";
	}
	
	public void work()
	{
		System.out.print(name+"work");
	}
}

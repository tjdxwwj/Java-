package MyComputer;

public class GigabyteMainboard extends mainboard {
	GigabyteMainboard(double price,int speed)
	{
		this.speed=speed;
		this.price=price;
		this.sign="Gigabyte";
	}
	 public void work()
		{
			System.out.print(this.getName()+"work");
		}
}

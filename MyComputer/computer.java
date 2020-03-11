package MyComputer;

public class computer implements ComputerFactory{
	private CPU CPU ;
	private RAM RAM;
	private mainboard MD;
	private HDD HDD;
	private String Name;
	private double price;
	computer(String name)
	{
		Name=name;
		price=0;
	}

	public void createCPU(CPU cpu) {
		// TODO Auto-generated method stub
		CPU=cpu;
		price+=cpu.getPrice();
	}

	@Override
	public void createRAM(RAM ram) {
		// TODO Auto-generated method stub
		RAM=ram;
		price+=RAM.getPrice();
	}

	@Override
	public void createmainboard(mainboard md) {
		// TODO Auto-generated method stub
		MD=md;
		price+=MD.getPrice();
	}

	@Override
	public void createHDD(HDD hdd) {
		// TODO Auto-generated method stub
		HDD=hdd;
		price+=HDD.getPrice();
	}
	
	public CPU getCPU()
	{
		return CPU;
	}
	public mainboard getMainboard()
	{
		return MD;
	}
	public RAM getRAM()
	{
		return RAM;
	}
	public HDD getHDD()
	{
		return HDD;
	}
	public String getName() {
		return Name;
	}
	public double getPrice() {
		return price;
	}
	public void description()
	{
		System.out.println("NAME:"+Name);
		System.out.println("RAM:"+RAM.getSign());
		System.out.println("HDD:"+HDD.getSign());
		System.out.println("mainboard:"+MD.getSign());
		System.out.println("CPU:"+CPU.getSign());
		
	}
	public void work()
	{
		RAM.work();
		HDD.work();
		MD.work();
		CPU.work();
	}

}

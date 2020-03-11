package MyComputer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computer computer1=new computer("1");
		computer computer2=new computer("2");
		computer computer3=new computer("3");
		
		AsusMainboard AsusMainboard=new AsusMainboard(100,20);
		AMDCPU AMDCPU =new AMDCPU(50,1);
		IntelCPU IntelCPU =new IntelCPU(50,1);
		SamsungRAM  SamsungRAM =new SamsungRAM (200,30);
		SeagateHDD SeagateHDD=new SeagateHDD(250,100);
		WestDigitalsHDD  WestDigitalsHDD=new  WestDigitalsHDD(300,50);
		
		computer1.createCPU(AMDCPU);
		computer1.createHDD(SeagateHDD);
		computer1.createmainboard(AsusMainboard);
		computer1.createRAM(SamsungRAM);
		
		computer2.createCPU(IntelCPU);
		computer2.createHDD(SeagateHDD);
		computer2.createmainboard(AsusMainboard);
		computer2.createRAM(SamsungRAM);
		
		computer3.createCPU(IntelCPU);
		computer3.createHDD( WestDigitalsHDD);
		computer3.createmainboard(AsusMainboard);
		computer3.createRAM(SamsungRAM);
		
		ComputerStore ComputerStore=new ComputerStore();
		try {
			ComputerStore.Add(computer1);
			ComputerStore.Add(computer2);
			ComputerStore.Add(computer3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ComputerStore.description();
		
	}

}

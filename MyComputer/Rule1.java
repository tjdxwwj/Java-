package MyComputer;

public class Rule1 implements Rule{

	public Boolean isSame(computer obj1, computer obj2) {
		// TODO Auto-generated method stub
		if(obj1.getCPU().getSign().equals(obj2.getCPU().getSign())
		&&obj1.getHDD().getSign().equals(obj2.getHDD().getSign())
		&&obj1.getMainboard().getSign().equals(obj2.getMainboard().getSign())
		&&obj1.getRAM().getSign().equals(obj2.getRAM().getSign()))
			return true;
		else return false;
	}

}

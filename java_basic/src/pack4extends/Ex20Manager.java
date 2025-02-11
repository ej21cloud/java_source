package pack4extends;

public class Ex20Manager extends Ex20Regular{
	private double incentive;
	
	public Ex20Manager(String irum, int nai, int salary) {
		super(irum, nai, salary);
		this.incentive = incentive;
	}
	
	
	@Override
	public double pay() {
		double imsi = super.pay();
		
		if(super.pay() >= 2500000)
			incentive = super.pay()*0.6;
		else if(imsi >= 2000000)
			incentive = super.pay()*0.5;
		else
			incentive = super.pay()*0.4;

		return incentive + imsi;
	}
	
	@Override
	public void print() {
		display();
		System.out.println(", 수령액:" + pay());
	}
}

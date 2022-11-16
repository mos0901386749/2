
public  class Employee {
	protected double salary;
	protected double bonus;
	
	protected BonusCalculator bc;
	
	public double getSalary() {
		return salary;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public double CalculateBonus() {
		return bonus =  bc.computerBonus(salary);
	}
	
	public void setBonusCompute(BonusCalculator b) {
		bc = b;
	}
}


public class Generous implements BonusCalculator {

	@Override
	public double computerBonus(double wage) {
		return (wage*10)/100;
	}

}

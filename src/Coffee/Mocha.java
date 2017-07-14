package Coffee;

public class Mocha extends CondimentDecorator
{

	
	public Mocha(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost()+150.00;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return  super.getDescription()+" with Mocha";
	}
}

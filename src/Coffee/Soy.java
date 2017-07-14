package Coffee;

public class Soy extends CondimentDecorator
{

	
	public Soy(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost()+200.00;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return  super.getDescription()+" with soy";
	}

}

package Coffee;

public class Carmel extends CondimentDecorator
{

	
	public Carmel(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 100.0+super.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return  super.getDescription()+"with carmel";
	}

}

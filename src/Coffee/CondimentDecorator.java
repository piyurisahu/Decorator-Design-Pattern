package Coffee;

public abstract class CondimentDecorator implements Beverage{

	private Beverage beverage;
	
	public CondimentDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return  beverage.getDescription();
	}



}

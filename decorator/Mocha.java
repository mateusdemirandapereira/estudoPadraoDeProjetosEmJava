package estudoPadroesProjetos.decorator;

public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	public Size getSize() {
		return this.beverage.getSize();
	}
	
	public double cost() {
		double cost = this.beverage.cost();
		Size size = this.getSize();
		
		switch(size) {
		
		case Size.TALL:
				cost += 0.10;
		case Size.GRANDE:
			cost += 0.15;
		case Size.VENTI:
			cost += 0.20;
		}
		
		return cost;
	}
	

}

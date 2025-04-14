package estudoPadroesProjetos.decorator;

public class Soy extends CondimentDecorator {
	
	Beverage beverage;
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public Size getSize() {
		return this.beverage.getSize();
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	public double cost() {
		double cost = this.beverage.cost();
		
		if (this.getSize() == Size.TALL) {
			 cost += 0.10;
		} else if (this.getSize() == Size.GRANDE) {
			cost += 0.15;
		} else if (this.getSize() == Size.VENTI) {
			cost += 0.20;
		}
		
		return cost;
	}

}

package estudoPadroesProjetos.decorator;

public class Whip extends CondimentDecorator {
	
	Beverage beverage;
	public Whip(Beverage beverage) {
		
		this.beverage = beverage;
	}
	
	public Size getSize() {
		return this.beverage.getSize();
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
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
			cost +=0.20;
		}
		
		
		return cost;
	}

}

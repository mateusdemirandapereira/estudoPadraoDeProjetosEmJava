package estudoPadroesProjetos.factory;

public abstract class PizzaStore {
	
	
	

	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	abstract Pizza createPizza(String type);

}

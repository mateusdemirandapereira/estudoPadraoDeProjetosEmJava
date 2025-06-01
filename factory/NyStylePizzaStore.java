package estudoPadroesProjetos.factory;

public class NyStylePizzaStore extends PizzaStore {
	
	
	Pizza createPizza(String type) {
		Pizza pizza;
		
		if (type.equals("cheese")) {
			pizza = new NyStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new NyStylePepperoniPizza()
		} else if (type.equals("clam")) {
			pizza = new NyStyleClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new NyStyleVeggiePizza();
		} 
		
		
		return pizza;
		
		
	}
	

}

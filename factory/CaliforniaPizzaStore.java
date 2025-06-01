package estudoPadroesProjetos.factory;

public class CaliforniaStylePizzaStore extends PizzaStore {
	
	Pizza createPizza(String type) {
		Pizza pizza;
		
		if (type.equals("cheese")) {
			pizza = new CaliforniaStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new CaliforniaStylePepperoniPizza()
		} else if (type.equals("clam")) {
			pizza = new CaliforniaStyleClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new CaliforniaStyleVeggiePizza();	
		} 
		
		return pizza;
	}

}

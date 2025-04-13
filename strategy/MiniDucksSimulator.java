package estudoPadroesProjetos.strategy;

public class MiniDucksSimulator {
	
	public static void main(String[] args) {
		
		Duck mallad = new MallardDuck();
		
		mallad.performQuack();
		
		mallad.performFly();
		
		
		Duck model = new ModelDuck();
		
		model.performFly();
		
		model.setFlyBehavior(new FlyRocketPowered());
		
		model.performFly();
		
	}

}

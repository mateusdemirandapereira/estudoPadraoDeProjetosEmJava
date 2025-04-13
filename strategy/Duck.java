package estudoPadroesProjetos.strategy;

public abstract class Duck {
	
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public void setFlyBehavior(FlyBehavior gb) {
		flyBehavior = gb;
	}
	
	public void setQuackBehavior(QuackBehavior gb) {
		quackBehavior = gb;
	}
	
	
	
	

}

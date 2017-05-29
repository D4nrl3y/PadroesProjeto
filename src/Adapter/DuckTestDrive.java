package Adapter;

public class DuckTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("Peru...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nPato...");
		testDuck(duck);
		
		System.out.println("\nPeruAdaptado...");
		testDuck(turkeyAdapter);
	}
	
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}

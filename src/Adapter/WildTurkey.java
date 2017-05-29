package Adapter;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println("GLU GLU GLU");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("O WildTurkey está voando, porém é uma curta distância!");
		
	}

}

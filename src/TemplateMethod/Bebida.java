package TemplateMethod;

public abstract class Bebida {
	
	public abstract void preparar();
	public abstract void incluirIngrediente();
	
	void prepararBebida(){
		ferverAgua();
		preparar();
		incluirIngrediente();
		colocarNaXicara();
	}
	
	public void ferverAgua(){
		System.out.println("Fervendo Água!");
	}
	
	public void colocarNaXicara(){
		System.out.println("Colocando na Xicara!");

	}

}

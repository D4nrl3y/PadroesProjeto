package TemplateMethod;

public class TesteBebida {
	public static void main(String[] args) {
		
		Bebida bebida = new Cha();
		bebida.prepararBebida();
		
		System.out.println("///////////////////////////////////////////");
		
		bebida = new Cafe();
		bebida.prepararBebida();
	
	}
}

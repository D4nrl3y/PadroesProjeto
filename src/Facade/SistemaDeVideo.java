package Facade;

public class SistemaDeVideo {

	public void configurarResolucao() {
		System.out.println("Resolução OK");
	}
	
	public void configurarCores() {
		System.out.println("Sistemas de cores OK");
	}
	
	public void renderizarImagem(String imagem) {
		System.out.println("Imagem: " + imagem + " renderizada");
	}
}

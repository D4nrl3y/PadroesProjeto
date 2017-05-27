package Facade;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("##### Configurando subsistemas #####");
		SistemasFacade fachada = new SistemasFacade();
		fachada.inicializarSubsistemas();

		System.out.println("##### Utilizando subsistemas #####");
		fachada.renderizarImagem("imagem.png");
		fachada.reproduzirAudio("teste.mp3");
		fachada.lerInput();
	
	}

}

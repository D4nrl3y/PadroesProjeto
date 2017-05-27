package Command;

public class PagamentoCartaoDebito implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		// TODO Auto-generated method stub
		System.out.println("Compra dbitada\n" + compra.getInfoNota());
	}

}

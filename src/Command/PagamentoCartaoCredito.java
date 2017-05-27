package Command;

public class PagamentoCartaoCredito implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		// TODO Auto-generated method stub
		System.out.println("Compra creditada!!\n" + compra.getInfoNota());
	}

}

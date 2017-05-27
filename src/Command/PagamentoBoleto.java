package Command;

public class PagamentoBoleto implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		// TODO Auto-generated method stub
		System.out.println("Boleto Criado!\n "+ compra.getInfoNota());
	}

}

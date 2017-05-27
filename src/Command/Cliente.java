package Command;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loja lojasCK = new Loja("CK");
		lojasCK.executarCompra(1000.00, new PagamentoCartaoCredito());
		lojasCK.executarCompra(55.00, new PagamentoBoleto());
		lojasCK.executarCompra(666.00, new PagamentoCartaoDebito());
		
		Loja Gojira = new Loja("Gojira Store");
		Gojira.executarCompra(25.00, new PagamentoCartaoCredito());
	}

}

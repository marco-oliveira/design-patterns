package observer;

import builder.ItensDaNota;
import builder.NotaFiscal;
import builder.NotaFiscalBuilder;

public class TestaAcao {
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcoes(new EnviadorDeEmail());
		builder.adicionaAcoes(new NotaFiscalDao());
		builder.adicionaAcoes(new EnviadorDeSms());
		builder.adicionaAcoes(new Impressora());
		builder.adicionaAcoes(new Multiplicador(5));
		
		NotaFiscal nf = builder.paraEmpresa("fulano de tal")
				.comCnpj("2121221212")
				.comItem(new ItensDaNota("Caneta", 500.0))
				.constroi();
		
		System.out.println(nf);
	}
}

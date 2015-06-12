package observer;

import builder.NotaFiscal;

public class Multiplicador implements AcaoAposGerarNota{
	private double fator;
		
	public Multiplicador(double fator) {
		this.fator = fator;
	}

	@Override
	public void executa(NotaFiscal nf) {
		double valor = nf.getValorBruto()*fator;
		System.out.println(valor);
	}

}

package chainofresponsibility.desconto;

import strategy.imposto.Orcamento;

public class CalculadorDeDescontos {
	
	public double caluculaDesconto(Orcamento orcamento){
		Desconto d1 = new DescontoAcimaDeCincoItens();
		Desconto d2 = new DescontoComMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);
		return d1.calcula(orcamento);
		
	}
	
}

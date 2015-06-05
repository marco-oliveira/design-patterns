package templatemethod;

import strategy.imposto.Orcamento;


public class Icpp extends TemplateImpostoCondicional{

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor()*0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor()*0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;	
	}



}

package decorator;

import strategy.imposto.Orcamento;

//classe copiada para fins didaticos
public class Icpp extends TemplateImpostoCondicional{
	
	public Icpp(Imposto outroImposto){
		super(outroImposto);
	}
	
	public Icpp(){
		super();
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor()*0.05 + calculaOutroImposto(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor()*0.07 + calculaOutroImposto(orcamento);
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;	
	}



}

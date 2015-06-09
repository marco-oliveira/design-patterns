package decorator;

import strategy.imposto.Orcamento;


public class Icms extends Imposto {

	public Icms(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public Icms(){
		
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor()*0.05 + 50.0 + calculaOutroImposto(orcamento);
	}

}

package decorator;

import strategy.imposto.Orcamento;

public class Ima extends Imposto {
	public Ima(Imposto outroImposto){
		super(outroImposto);
	}
	
	public Ima(){
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculaOutroImposto(orcamento);
	}

}

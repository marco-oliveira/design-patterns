package decorator;

import strategy.imposto.Orcamento;

//classe copiada para fins didaticos
public abstract class TemplateImpostoCondicional extends Imposto {

	public TemplateImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public TemplateImpostoCondicional() {
		super();
	}

	@Override
	public final double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento);
		}else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}

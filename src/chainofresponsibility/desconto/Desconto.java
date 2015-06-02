package chainofresponsibility.desconto;

import strategy.imposto.Orcamento;

public interface Desconto {
	double calcula(Orcamento orcamento);
	void setProximo(Desconto proximo);
	
}

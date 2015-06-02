package chainofresponsibility.desconto;

import strategy.imposto.Orcamento;

public class DescontoComMaisDeQuinhentosReais implements Desconto {
	Desconto proximo;
	@Override
	public double calcula(Orcamento orcamento) {
		if(orcamento.getValor() >500.0){
			return orcamento.getValor()*0.07;
		}else{
			return proximo.calcula(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}

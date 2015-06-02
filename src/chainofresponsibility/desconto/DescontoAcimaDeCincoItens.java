package chainofresponsibility.desconto;

import strategy.imposto.Orcamento;

public class DescontoAcimaDeCincoItens implements Desconto {
	Desconto proximo;
	@Override
	public double calcula(Orcamento orcamento) {
		
		if(orcamento.getItens().size() > 5){
			return orcamento.getValor()*0.1;
		}
		return proximo.calcula(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}

}

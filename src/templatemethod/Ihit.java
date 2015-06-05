package templatemethod;

import java.util.ArrayList;
import java.util.List;

import strategy.imposto.Orcamento;
import chainofresponsibility.desconto.Item;

public class Ihit extends TemplateImpostoCondicional {
	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		
		return (orcamento.getValor()*0.01) * orcamento.getItens().size();
	}


	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor()*0.13 + 100;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
	List<String> noOrcamento = new ArrayList<String>();
	for (Item item : orcamento.getItens()){
			if(noOrcamento.contains(item.getNome())){ 
				return true;
			}else{
				noOrcamento.add(item.getNome());
			}
		}
		return false;
	}

}

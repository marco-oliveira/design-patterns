package templatemethod;



import strategy.imposto.Orcamento;
import chainofresponsibility.desconto.Item;

public class Ikcv extends TemplateImpostoCondicional {

	private boolean temItemMaiorQueCemReais(Orcamento orcamento) {
	
		for (Item item : orcamento.getItens()) {
			if(item.getValor() > 100.0){
				return true;
			}
		}
		return false;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.10;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500.0 && temItemMaiorQueCemReais(orcamento);
	}
}
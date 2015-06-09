package decorator;



import strategy.imposto.Orcamento;
import chainofresponsibility.desconto.Item;

public class Ikcv extends TemplateImpostoCondicional {
	
	public Ikcv(Imposto outroImposto){
		super(outroImposto);
	}
	
	public Ikcv(){
		super();
	}

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
		return orcamento.getValor()*0.06 + calculaOutroImposto(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.10 + calculaOutroImposto(orcamento);
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500.0 && temItemMaiorQueCemReais(orcamento);
	}
}
package chainofresponsibility.desconto;

import strategy.imposto.Orcamento;

public class DescontoPorVendaCasada implements Desconto {
	private Desconto proximo;
	
	@Override
	public double calcula(Orcamento orcamento) {
		if (aconteceuVendaCasada(orcamento)) {
			return orcamento.getValor()*0.05;
		}else{
			return proximo.calcula(orcamento);
		}
	}
	
	public boolean aconteceuVendaCasada(Orcamento orcamento){
		if(existe("LAPIS", orcamento) && existe("CANETA", orcamento)){
			return true;
		}else {
			return false;
		}
	}
	
	public boolean existe(String nome, Orcamento orcamento){
		for(Item item : orcamento.getItens()){
			if(item.getNome().equals(nome)) return true;
		}
		return false;
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}



}

package templatemethod;

import chainofresponsibility.desconto.Item;
import strategy.imposto.Imposto;
import strategy.imposto.Orcamento;

public class TestaIposto {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adiciona(new Item("lapis", 200.0));
		orcamento.adiciona(new Item("borracha", 400.0));
		orcamento.adiciona(new Item("borracha", 400.0));
		
		
		Imposto icpp = new Icpp();
		Imposto ikcv = new Ikcv();
		Imposto ihit = new Ihit();
		System.out.println(icpp.calcula(orcamento));
		System.out.println(ikcv.calcula(orcamento));
		System.out.println(ihit.calcula(orcamento));
	}	
}

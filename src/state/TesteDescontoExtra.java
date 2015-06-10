package state;

import strategy.imposto.Orcamento;

public class TesteDescontoExtra {
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500.0);
		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
		
		reforma.aprova();
		reforma.aplicaDescontoExtra();
		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
		
		reforma.finaliza();
	}
}

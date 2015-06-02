package chainofresponsibility.desconto;

import strategy.imposto.Orcamento;

public class TestaDesconto {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(300.0);
		orcamento.adiciona(new Item("CANETA", 350.0));
		orcamento.adiciona(new Item("LAPIS", 250.0));
		
		CalculadorDeDescontos calc = new CalculadorDeDescontos();
		double desconto = calc.caluculaDesconto(orcamento);
		System.out.println(desconto);
	}
}

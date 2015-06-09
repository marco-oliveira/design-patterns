package decorator;

import strategy.imposto.Orcamento;

public class TestaImposto {
	public static void main(String[] args) {
		Imposto impostoComplexo = new Iss(new Icms());
		Orcamento orcamento = new Orcamento(500);
		double valor = impostoComplexo.calcula(orcamento);
		System.out.println(valor);
	}

}

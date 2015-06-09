package decorator;

import strategy.imposto.Orcamento;

public class TestaImpostoAlto {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(1000);
		Imposto impostoAlto = new Ima(new Iss(new Icms(new Ikcv(new Icpp()))));
		double valor = impostoAlto.calcula(orcamento);
		System.out.println(valor);
	}
}

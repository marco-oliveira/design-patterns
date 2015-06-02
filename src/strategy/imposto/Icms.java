package strategy.imposto;


public class Icms implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor()*0.05 + 50.0;
	}

}

package strategy.imposto;


public class TestaImpostos {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(4000.0);
		Imposto icms = new Icms();
		Imposto iss = new Iss();
		Imposto iccc = new Iccc();
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.calcula(orcamento, icms);
		calculador.calcula(orcamento, iss);
		calculador.calcula(orcamento, iccc);
		
	}
}

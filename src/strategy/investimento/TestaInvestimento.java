package strategy.investimento;


public class TestaInvestimento {
	public static void main(String[] args) {
		Conta c1 = new Conta(1250.0);
		
		System.out.println(c1.getSaldo());
		
		//Investimento conservador = new Conservador();
		//Investimento moderado = new Moderado();
		Investimento arrojado = new Arrojado();
		RealizadorDeInvestimentos realizador = new RealizadorDeInvestimentos();
		realizador.realizaInvestimento(c1, arrojado);
		
		System.out.println(c1.getSaldo());
	}

}

package strategy.investimento;

public class RealizadorDeInvestimentos {
	
	public void realizaInvestimento(Conta conta, Investimento extrategiaInvestimento){
		double resultado = extrategiaInvestimento.calcula(conta);
		conta.deposita(resultado*0.75);
	}
}

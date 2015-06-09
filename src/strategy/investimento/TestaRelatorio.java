package strategy.investimento;

import java.util.ArrayList;
import java.util.List;

import templatemethod.Relatorio;
import templatemethod.RelatorioComplexo;
import templatemethod.RelatorioSimples;

public class TestaRelatorio {
	public static void main(String[] args) {
		Conta conta = new Conta(5555.0, "conta1", 1, "112-1");
		Conta conta2 = new Conta(1000.0, "conta2", 2, "112-1");
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(conta);
		contas.add(conta2);
		Relatorio relatorio = new RelatorioSimples();
		relatorio.imprime(contas);
		Relatorio relatorio2 = new RelatorioComplexo();
		relatorio2.imprime(contas);
	}
}

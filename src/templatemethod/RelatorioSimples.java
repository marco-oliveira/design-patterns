package templatemethod;

import java.util.List;

import strategy.investimento.Conta;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XZI");
		
	}

	@Override
	protected void rodape() {
		System.out.println("Telefone: (11)9955-6548");
		
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for(Conta conta: contas){
			System.out.println(conta.getNome()+" - "+conta.getSaldo());
		}
		
	}

}

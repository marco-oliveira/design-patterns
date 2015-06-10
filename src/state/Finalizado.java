package state;

import strategy.imposto.Orcamento;

public class Finalizado implements EstadoDeOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não recebem descontos extras!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja finalizado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja finalizado!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja finalizado!");
	}

}

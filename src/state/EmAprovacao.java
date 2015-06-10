package state;

import strategy.imposto.Orcamento;

public class EmAprovacao implements EstadoDeOrcamento {
	
	private boolean descontoAplicado = false;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento){
		if(!descontoAplicado){
			orcamento.valor -= orcamento.valor *0.05;
		}else {
			throw new RuntimeException("Desconto já Aplicado!");
		}
		descontoAplicado = true;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento em aprovação não pode ser finalizado!");
	}

}

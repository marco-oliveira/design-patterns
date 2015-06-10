package state;

import strategy.imposto.Orcamento;

public interface EstadoDeOrcamento {
	void aplicaDescontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	void reprova(Orcamento orcamento);
	void finaliza(Orcamento orcamento);
	
}

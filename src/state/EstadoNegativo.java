package state;

import strategy.investimento.Conta;

public class EstadoNegativo implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Não pode sacar, conta negativa!");
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor*0.95;
		if(conta.saldo > 0){
			conta.estado = new EstadoPositivo();
		}
	}

}

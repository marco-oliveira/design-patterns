package strategy.investimento;

import java.util.Random;

public class Arrojado implements Investimento {
	Random random;
	
	public Arrojado() {
		 this.random = new Random();
	}
	@Override
	public double calcula(Conta conta) {
		
		int chance = random.nextInt(10);
		if(chance>=0 && chance <= 1){
			return conta.getSaldo()*0.05;
		} else if(chance >= 2 && chance <= 4){
			return conta.getSaldo()*0.03;
		} else{
			return conta.getSaldo()*0.006;
		}
	}

}

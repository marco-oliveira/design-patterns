package strategy.investimento;

import java.util.Random;

public class Moderado implements Investimento {

	@Override
	public double calcula(Conta conta) {
		Random random = new Random();
		int chance = random.nextInt(2);
		if(chance == 0){
			return conta.getSaldo()*0.025;
		}else {
			return conta.getSaldo()*0.007;
		}
	}

}

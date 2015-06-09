package decorator;

import java.util.ArrayList;
import java.util.List;

import strategy.investimento.Conta;

public class MaiorQueQuinhetosMilReais extends Filtro{

	public MaiorQueQuinhetosMilReais(Filtro outroFiltro){
		super(outroFiltro);
	}
	
	public MaiorQueQuinhetosMilReais(){
		super();
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrado = new ArrayList<Conta>();
		for(Conta c : contas){
			if(c.getSaldo()> 500000){
				filtrado.add(c);
			}
		}
		filtrado.addAll(contas);
		return filtrado;
	}

}

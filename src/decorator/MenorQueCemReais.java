package decorator;

import java.util.ArrayList;
import java.util.List;

import strategy.investimento.Conta;

public class MenorQueCemReais extends Filtro {
	
	public MenorQueCemReais(Filtro outroFiltro){
		super(outroFiltro);
	}
	
	public MenorQueCemReais() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for(Conta c: contas){
			if (c.getSaldo()< 100) {
				filtrada.add(c);
			}
		}
		filtrada.addAll(contas);
		return filtrada;
	}

}

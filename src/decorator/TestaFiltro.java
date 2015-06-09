package decorator;

import java.util.ArrayList;
import java.util.List;

import strategy.investimento.Conta;

public class TestaFiltro {
	public static void main(String[] args) {
		Conta c = new Conta(500);
		c.setDataAbertura(10, 6, 2015);
		Conta c1 = new Conta(400);
		c1.setDataAbertura(9, 5, 2015);
		Conta c2 = new Conta(90);
		c2.setDataAbertura(9, 4, 2015);
		Conta c3 = new Conta(5000000);
		c3.setDataAbertura(9, 6, 2015);
		
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(c);
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		Filtro filtro = new MaiorQueQuinhetosMilReais(new MenorQueCemReais(new MesCorrente()));
		System.out.println(filtro.filtra(contas));
	}
}

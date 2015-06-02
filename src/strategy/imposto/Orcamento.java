package strategy.imposto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chainofresponsibility.desconto.Item;

public class Orcamento {
	
	private double valor;
	
	private final List<Item> itens;
	
	public Orcamento(double valor){
		this.valor = valor;
		 this.itens = new ArrayList<Item>();
	}

	public double getValor() {
		return valor;
	}
	
	public void adiciona(Item item){
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

}

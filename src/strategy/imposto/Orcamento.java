package strategy.imposto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import state.EmAprovacao;
import state.EstadoDeOrcamento;
import chainofresponsibility.desconto.Item;

public class Orcamento {
	//não deveria ser public, deveria ser protected. Mas por organização dos pacotes...
	public double valor;
	public EstadoDeOrcamento estadoAtual;
	
	private final List<Item> itens;
	
	public Orcamento(double valor){
		this.valor = valor;
		 this.itens = new ArrayList<Item>();
		 this.estadoAtual = new EmAprovacao();
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

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova(){
		estadoAtual.aprova(this);
	}
	
	public void reprova(){
		estadoAtual.reprova(this);
	}
	
	public void finaliza(){
		estadoAtual.finaliza(this);
	}

}

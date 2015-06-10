package strategy.investimento;

import java.util.Calendar;

import state.EstadoDaConta;
import state.EstadoPositivo;


public class Conta {
	
	//esta public para fins didaticos
	public double saldo;
	public EstadoDaConta estado;
	private String nome;
	private int numero;
	private String agencia;
	private Calendar dataAbertura;
	public Conta(double saldo){
		this.saldo = saldo;
		estado = new EstadoPositivo();
	}
	
	
	public Conta(double saldo, String nome, int numero, String agencia) {
		super();
		this.saldo = saldo;
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
	}

	public void saca(double valor){
		estado.saca(this, valor);
	}
	
	public void deposita(double valor){
		estado.deposita(this, valor);
	}

	public double getSaldo() {
		return saldo;
	}
	

	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	public int getNumero() {
		// TODO Auto-generated method stub
		return numero;
	}

	public String getAgencia() {
		// TODO Auto-generated method stub
		return agencia;
	}



	public Calendar getDataAbertura() {
		// TODO Auto-generated method stub
		return dataAbertura;
	}
	
	public void setDataAbertura(int dia, int mes, int ano){
		Calendar c = Calendar.getInstance();
		c.set(ano, mes, dia);
		this.dataAbertura = c;
	}
}

package strategy.investimento;

import java.util.Calendar;


public class Conta {
	
	
	private double saldo;
	private String nome;
	private int numero;
	private String agencia;
	private Calendar dataAbertura;
	private int cont = 0;
	public Conta(double saldo){
		this.saldo = saldo;
		cont++;
	}
	
	
	public Conta(double saldo, String nome, int numero, String agencia) {
		super();
		this.saldo = saldo;
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
	}



	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double saldo){
		this.saldo += saldo;
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "conta" + cont;
	}
	
}

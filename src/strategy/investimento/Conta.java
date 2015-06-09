package strategy.investimento;


public class Conta {
	
	
	private double saldo;
	private String nome;
	private int numero;
	private String agencia;
	
	public Conta(double saldo){
		this.saldo = saldo;
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
	
}

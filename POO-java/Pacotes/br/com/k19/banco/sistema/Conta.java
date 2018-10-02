package br.com.k19.banco.sistema;

public class Conta {
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double valor){
		this.saldo += valor;
	}
}

package Banco;

public class Conta {
	public double saldo;
	public double limite = 400;
	public int numero;
	public Agencia agencia;
	
	public Conta(Agencia agencia){
		this.agencia = agencia;
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public void imprimeExtrato(){
		System.out.println("SALDO: " + this.saldo);
	}
	
	public double consultaSaldoDisponivel() {
		return this.saldo + this.limite;
	}
	
	public void transfere(Conta destino, double valor){
		this.saldo -= valor;
		destino.saldo += valor;
	}
	
	
}
package pkg;

public class Cuenta {
	
	Double saldo;
	String numero;
	String titular;
	
	public Cuenta(Double saldo) {
		this.saldo = saldo;
	}

	public Cuenta(Double saldo, String numCuenta, String nombre) {
		this.saldo = saldo;
		this.numero = numCuenta;
		this.titular = nombre;
	}

	public void ingresar(Double i) {
		saldo += i;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void retirar(Double d) {
		this.saldo -= d;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
}

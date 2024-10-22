package pkg;

import java.util.List;

import pkg.Movimiento.signo;

public class Cuenta {
	
	Double saldo;
	String numero;
	String titular;
	List<Movimiento> mMovimientos;
	
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
		Movimiento m = new Movimiento(i, signo.I, "Ingreso de " + i + "€");
		mMovimientos.add(m);
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void retirar(Double d) {
		if(this.saldo-d>=-500d) {
			this.saldo -= d;
			Movimiento m = new Movimiento(d, signo.R, "Reintegro de " + d + "€");
			mMovimientos.add(m);
		}
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

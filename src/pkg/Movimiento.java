package pkg;

public class Movimiento {
	Double importe;
	enum signo {I, R};
	String detalle;
	signo operacion;
	
	public Movimiento(Double importe, signo s, String detalle) {
		super();
		this.importe = importe;
		this.detalle = detalle;
		this.operacion = s;
	}
	
	
}

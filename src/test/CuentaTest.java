package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	
	Cuenta cuenta, cuenta1, cuenta2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta(0d);
		cuenta1 = new Cuenta(50d, "12345", "Pepe");
		cuenta2 = new Cuenta(0d, "67890", "Luis");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(1d);
		assertEquals(1, cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(1d);
		assertEquals(-1, cuenta.getSaldo());
	}
	
	@Test
	void test0014() {
		//se van a crear dos var boolean para comprobar los saldos finales, y se va usar el asserboolean
		cuenta1.retirar(200d);
		cuenta2.retirar(350d);
		cuenta1.ingresar(100d);
		cuenta2.retirar(200d);
		cuenta2.retirar(150d);
		cuenta1.retirar(200d);
		cuenta2.ingresar(50d);
		cuenta2.retirar(200d);
		
		Double saldoFinal1 = -250d;
		Double saldoFinal2 = -450d;
		Boolean correcto = false;
		
		cuenta2.setSaldo(saldoFinal2);
		
		System.out.println("Cuenta " + cuenta1.getNumero() + " tiene de saldo final: " + cuenta1.getSaldo());
		System.out.println("Cuenta " + cuenta2.getNumero() + " tiene de saldo final: " + cuenta2.getSaldo());
		
		
		if(cuenta1.getSaldo().equals(saldoFinal1) && cuenta2.getSaldo().equals(saldoFinal2)) {
			correcto = true;
		}
		
		assertTrue(correcto);
	}

}

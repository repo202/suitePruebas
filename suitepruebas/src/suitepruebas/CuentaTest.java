package suitepruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CuentaTest {
	private Cuentas cuenta;
	
	@BeforeEach
	public void setUp(){
		this.cuenta = new Cuentas();
	}
	
	@Test
	public void consignarTest()  {
		assertEquals(10000, this.cuenta.consignar(10000));
	}
	@Test
	public void retirarTest() throws Exception {
		assertEquals(5000, this.cuenta.retirar(5000));
	}
	

}

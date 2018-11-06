package bbva.pe.demo.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bbva.pe.demo.model.Cuenta;

public class CuentaTest {
	
	@Test
	public void crearCuentaSaldoEsCero() {
		Cuenta cuenta= new Cuenta();
		assertEquals(cuenta.getSaldo(),0);

	}
	
	@Test
	public void alIngresar100EnCuentaVaciaElSaldoEs100() {
		Cuenta cuenta = new Cuenta();
		cuenta.ingreso(100);
		assertEquals(cuenta.getSaldo(),100);
	}
	
	@Test
	public void alIngresar3000EnCuentaVaciaElSaldoEs3000() {
		Cuenta cuenta = new Cuenta();
		cuenta.ingreso(3000);
		assertEquals(cuenta.getSaldo(),3000);
	}
	
	@Test
	public void alIngresar3000EnCuentaCon100ElSaldoEs3100() {
		//Cuenta cuenta = new Cuenta(100);
		
		//Arrange (Set Up)
		Cuenta cuenta = new Cuenta();
		cuenta.ingreso(100);
		
		//Act = Acciones
		cuenta.ingreso(3000);
		
		//Assert
		assertEquals(cuenta.getSaldo(),3100);
		
	}
	
	@Test
	public void noSePuedeIngresarCantidadNegativa() {
		//arrange
		Cuenta cuenta = new Cuenta();
		
		cuenta.ingreso(-100);
		
		assertEquals(cuenta.getSaldo(),0);
		
	}
}

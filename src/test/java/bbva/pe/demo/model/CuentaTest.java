package bbva.pe.demo.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bbva.pe.demo.model.Cuenta;

public class CuentaTest {
	
	@Test
	public void crearCuentaSaldoEsCero() {
		Cuenta cuenta= new Cuenta();
		//assertEquals(cuenta.getSaldo(),0.0);
		assertEquals("El saldo de la cuenta no es correcto",0,cuenta.getSaldo(),0);

	}
	
	@Test
	public void alIngresar100EnCuentaVaciaElSaldoEs100() {
		Cuenta cuenta = new Cuenta();
		cuenta.ingreso(100);
		//assertEquals(cuenta.getSaldo(),100);
		assertEquals("El saldo de la cuenta no es correcto",100,cuenta.getSaldo(),0);
	}
	
	@Test
	public void alIngresar3000EnCuentaVaciaElSaldoEs3000() {
		Cuenta cuenta = new Cuenta();
		cuenta.ingreso(3000);
		assertEquals("El saldo de la cuenta no es correcto",3000,cuenta.getSaldo(),0);
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
		assertEquals("El saldo de la cuenta no es correcto",3100,cuenta.getSaldo(),0);
		
	}
	
	@Test
	public void noSePuedeIngresarCantidadNegativa() {
		//arrange
		Cuenta cuenta = new Cuenta();
		
		cuenta.ingreso(-100);
		
		//assertEquals(cuenta.getSaldo(),0);
		assertEquals("El saldo de la cuenta no es correcto",0,cuenta.getSaldo(),0);
		
	}
	
	@Test
	public void ingresoCantidad2Decimales() {
		Cuenta cuenta = new Cuenta();
		cuenta.ingreso(100.45);
		//assertEquals(cuenta.getSaldo(),100.45);
		assertEquals("El saldo de la cuenta no es correcto",100.45,cuenta.getSaldo(),0);
	}
	
	@Test
	public void ingresoCantidadMasDe2DecimalesNoEsValido() {
		Cuenta cuenta = new Cuenta();
		cuenta.ingreso(100.457);
		assertEquals("El saldo de la cuenta no es correcto",0,cuenta.getSaldo(),0);
	}
	
	//TEST NO APORTA NADA
	@Test
	public void ingresoMaximoEsDe6000() {
		Cuenta cuenta = new Cuenta();
		cuenta.ingreso(6000);
		assertEquals("El saldo de la cuenta no es correcto",6000,cuenta.getSaldo(),0);
	}
	
	@Test
	public void ingresoMasDe6000NoEsValido() {
		Cuenta cuenta = new Cuenta();
		cuenta.ingreso(6000.01);
		assertEquals("El saldo de la cuenta no es correcto",0,cuenta.getSaldo(),0);
	}
	@Test
	public void ingresoMasDe6000NoEsValidoAlIngresar7000EnCuentaCon2350ElSaldoSeQuedaEn2350(){
		Cuenta cuenta = new Cuenta();
		cuenta.ingreso(2350);
		
		cuenta.ingreso(7000);
		assertEquals("El saldo de la cuenta no es correcto",2350,cuenta.getSaldo(),0);
	}
	
	
	

}

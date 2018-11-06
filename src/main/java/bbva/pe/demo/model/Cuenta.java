package bbva.pe.demo.model;

import java.text.DecimalFormat;

public class Cuenta {

	private double saldo;
	
	
	
	public Cuenta() {
		super();
		this.saldo = 0;
	}


	public double getSaldo() {
		return this.saldo;
	}


	public void ingreso(double cantidad) {
		if(formatearDecimales(cantidad,2)!=cantidad)
		{
			this.saldo=0;
		}
		else if(cantidad<0) {
			this.saldo=0;
		}else {
			this.saldo = this.saldo + cantidad;
		}
		
	}
	
	private static Double formatearDecimales(Double numero, Integer numeroDecimales) {
		return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
	}

}

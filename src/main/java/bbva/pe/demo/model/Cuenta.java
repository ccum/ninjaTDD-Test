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
		boolean esValida=esCantidadValida(cantidad);
		if(esValida) {
			this.saldo = this.saldo + cantidad;
		}
		else {
			this.saldo =0;
		}
	}

	private boolean esCantidadValida(double cantidad) {
		if(formatearDecimales(cantidad,2)!=cantidad)
		{
			return false;
		}
		if(cantidad<0) {
			return false;
		}
		if(cantidad>6000) {
			return false;
		}
		return true;
	}
	
	private static Double formatearDecimales(Double numero, Integer numeroDecimales) {
		return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
	}

}

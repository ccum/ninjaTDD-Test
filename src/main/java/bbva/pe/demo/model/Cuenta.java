package bbva.pe.demo.model;

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
		if(cantidad<0) {
			this.saldo=0;
		}else {
			this.saldo = this.saldo + cantidad;
		}
		
	}
	

}

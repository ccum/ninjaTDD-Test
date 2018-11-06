package bbva.pe.demo.model;

public class Cuenta {

	private int saldo;
	
	
	
	public Cuenta() {
		super();
		this.saldo = 0;
	}


	public int getSaldo() {
		return this.saldo;
	}


	public void ingreso(int cantidad) {
		if(cantidad<0) {
			this.saldo=0;
		}else {
			this.saldo = this.saldo + cantidad;
		}
		
	}

}

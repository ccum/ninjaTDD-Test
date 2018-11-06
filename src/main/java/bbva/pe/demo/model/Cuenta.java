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


	public void ingreso(int i) {
		this.saldo = this.saldo + i;
		
	}

}

package vehiculos;


public class Moto implements IVehiculo {
	

	protected int velocidad;	
	protected String matricula;

	public Moto( String matricula) {
		super();
		this.matricula = matricula;
	}
	

	public int acelerar(int velocidad) {
		// Este codigo no tiene nada que ver con la de otras clases y es completamente diferente
		this.velocidad += velocidad;
		return this.velocidad;
	}


	public int frenar(int velocidad) {
		// Este codigo no tiene nada que ver con la de otras clases	 y es completamente diferente
		this.velocidad -= velocidad;
		return this.velocidad;
	}


	public String getMatricula() {
		// Este codigo no tiene nada que ver con la de otras clases  y es completamente diferente
		return matricula;
	}


	public String toString() {
		return "Moto [velocidad=" + velocidad + ", matricula=" + matricula
				+ "]";
	}

}

package vehiculos;

public class Coche implements IVehiculo {

	protected int velocidad;
	protected String matricula;
	

	public Coche(String matricula) {
		super();
		this.matricula = matricula;
		this.velocidad = 0;
	}

	/* (non-Javadoc)
	 * @see vehiculos.IVehiculo#acelerar(int)
	 */
	@Override
	public int acelerar(int velocidad) {
		this.velocidad += velocidad;
		return this.velocidad;
	}

	/* (non-Javadoc)
	 * @see vehiculos.IVehiculo#frenar(int)
	 */
	@Override
	public int frenar(int velocidad) {
		this.velocidad -= velocidad;
		return this.velocidad;
	}

	/* (non-Javadoc)
	 * @see vehiculos.IVehiculo#getMatricula()
	 */
	@Override
	public String getMatricula() {
		return matricula;
	}

}
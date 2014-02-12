package vehiculos;

public class Turismo extends Coche {

	protected String color;

	public Turismo(String matricula, String color) {
		super(matricula);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void pintar(String color) {
		this.color = color;
	}
	

}

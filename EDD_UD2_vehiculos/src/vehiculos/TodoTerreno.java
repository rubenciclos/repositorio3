package vehiculos;


public class TodoTerreno extends Coche {
	
	private String traccion;

	
	
	public TodoTerreno ( String matricula ) {
		super(matricula);
		this.matricula = matricula;
		this.traccion = "2-RUEDAS";
	}
	
	public void setTraccion4X4(boolean activacion){
		if (activacion){
			this.traccion = "4-RUEDAS";
		}else{
			this.traccion = "2-RUEDAS";
		}		
	}
	
	public String getTraccion(){
		return this.traccion;
	}

	@Override
	public String toString() {
		return "TodoTerreno [{ " + "velocidad=" + velocidad + ", matricula=" + matricula + "  traccion=" + traccion + "]";
	}


}

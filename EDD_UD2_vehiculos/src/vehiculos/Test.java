package vehiculos;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// Crear los objetos vehiculo individuales
		IVehiculo c1 = new Coche("9012-DDD");
		Coche t1 = new Turismo("1234-AAA", "blanco" );
		Coche t2 = new Turismo("4567-BBB", "verde" );		
		TodoTerreno td1 = new TodoTerreno ( "4567-CCC");
		Moto m1 = new Moto("3456-EEE");
		
		// Anyadir a la lista de vehiculos
		ArrayList <IVehiculo> itv_motor = new ArrayList<IVehiculo>();
		itv_motor.add( c1 );
		itv_motor.add( t1 );
		itv_motor.add( t2 );
		itv_motor.add( td1 );
		itv_motor.add( m1 );
		
		
		// Mostrar la lista de vehiculos
		System.out.println( "La lista de vehiculos a revisar el motor son[" + itv_motor.size() + "]:" );
		for( IVehiculo v : itv_motor ){
			System.out.println( v.toString() );
		}
						
	}

}

package Parking;

import java.util.ArrayList;

public class Plaza {
	
	
	
	//Atributos
	private int numero;
	private boolean ocupada;
	private Vehiculos vehiculo;
	
	
	//Creamos el constructor para poder recorrer la clase Parking
	public Plaza(int numero) {
		this.numero = numero;
		this.ocupada = false;//false
		this.vehiculo = null;//Vehiculo lo definimos como null ya que no hay ningún vehúculo dentro
	
	}
	

	
	//Metodo ocupar plaza, nos devolverá un booleano
	public boolean ocuparPlaza(Vehiculos vehiculo) {
		if(ocupada==false) {
			this.ocupada=true;
			this.vehiculo=vehiculo;
			return true;
			
		}
		else {
			return false;
		
		}
		
	}
	
	
	//Metodo liberarPlaza, nos devolverá un vehiculo
	//Creamos una variable temporal para que cuando el coche libere la plaza podamos volver a empezar 
	public Vehiculos liberarPlaza() {
		if(ocupada) {
			Vehiculos borrar = this.vehiculo;
			this.ocupada=false;
			this.vehiculo=null;
			return borrar;
			
		}
		return vehiculo;
	}
	

	//getters y setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public Vehiculos getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculos vehiculo) {
		this.vehiculo = vehiculo;
	}

	//toString
	@Override
	public String toString() {
		return "Plaza [numero=" + numero + ", ocupada=" + ocupada + ", vehiculo=" + vehiculo + "]";
	}




	
	
	
	

}

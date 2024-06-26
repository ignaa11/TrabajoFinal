package Parking;

import java.util.ArrayList;


public class Vehiculos {
	
	//Atributos
	private char matricula;
	private char tipo;
	private int plaza;
	

	//Constructor
	public Vehiculos(char matricula, char tipo, int plaza) {
		super();
		this.matricula = matricula;
		this.tipo = tipo;
		this.plaza = plaza;
	}

	

	//Getters
	public char getMatricula() {
		return tipo;
	}
	
	public char getModelo() {
		return tipo;
	}
	
	public int getPlaza() {
		return plaza;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "VehiculosEntrada [matricula=" + matricula + ", modelo=" + tipo + ", plaza=" + plaza + "]";
	}
	

}



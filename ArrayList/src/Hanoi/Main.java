package Hanoi;

public class Main {

	public static void main(String[] args) {

		//Creamos nuuestro objeto el cual contendrá tres discos
		Hanoi h1 = new Hanoi(3);
		
		h1.mueve('A','C');
		h1.Imprimir();
		System.out.println();
		System.out.println();
		System.out.println();

		h1.mueve('C', 'B');
		h1.Imprimir();
		System.out.println();
		System.out.println();
		System.out.println();
		
		h1.mueve('B', 'A');
		h1.Imprimir();

	}

}

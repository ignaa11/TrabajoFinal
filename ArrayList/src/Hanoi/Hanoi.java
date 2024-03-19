package Hanoi;

public class Hanoi {
	
	int numeroDisco;
	//Definimos las torres
	private Torre A;
	private Torre B;
	private Torre C;
	 
	 public Hanoi(int numeroDiscos) {
	 //Creamos las torres
	 A= new Torre();
	 B= new Torre();
	 C= new Torre();
	 this.numeroDisco=numeroDiscos;
	 //Recorremos las torres para agregar disco, de arriba a abajo. Con el metodo agregardisco
	 //conseguiremos añadir discos (this.A.agregarDisco(new Disco(i));)

	 for(int i=numeroDiscos;i>0;i--) {
		 this.A.agregarDisco(new Disco(i));
	 }
		 
	 }
	 
	 //Metodo imprimir, que nos muestra el estado de las tres torres
	 public void Imprimir() {
		 System.out.println(A);
		 System.out.println("----------------------");
		 System.out.println(B);
		 System.out.println("----------------------");
		 System.out.println(C);
	 }
	 
	 //Metodo mueve, lo usaremos para mover un disco de una torre a otra 
	 public void mueve(char origen , char destino) {
		//Creamos 2 variables temporales
		Torre torreOrigen;
		Torre torreDestino;
		
		//Origen
		if(origen=='A') {
			torreOrigen=A;
		}
		else if(origen=='B') {
			torreOrigen=B;
		}
		else{
			torreOrigen=C;
		}
		
		//Destino
		if(destino=='A') {
			torreDestino=A;
		}
		else if(destino=='B') {
			torreDestino=B;
		}
		else{
			torreDestino=C;
		}
		
		torreDestino.agregarDisco(torreOrigen.removerDisco());
		 
	 }
	 
	
	 
	}



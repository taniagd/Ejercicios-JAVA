import java.util.Scanner; 
/*Esta clase est� dentro de las librer�as, por eso se debe incluir al inicio del
 * programa, para que se ejecute exitosamente*/
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduzca su nombre, por favor"); 
		//Imprimo en consola el mensaje a mostrar pidiendo el dato

		String addName = "";
		//Declaro variable string pues se debe ingresar cadena de texto
		
		Scanner name = new Scanner (System.in);
		/* Creo el objeto scanner y se asocia con el dispositivo de entrada que
		ser� el teclado, por eso se usa system.in*/
		
		addName = name.nextLine();
		/*Llamamos al objeto Scanner creado en l12 y se usa m�todo nextLine, que 
		 * har� que lo insertado se lea como cadena de texto*/
		
		System.out.println("Tu nombre es:"  + addName);
		//Se imprime en consola el nombre insertado. 
	}

}

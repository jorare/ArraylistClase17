import java.util.ArrayList;
import java.util.List;


public class Ejercicio3 {

//    Objetivo: Filtrar elementos en una lista según un criterio específico.
//            Instrucciones:
//    Crea un ArrayList de números enteros.
//    Llénalo con los números 1 a 10.
//    Filtra los números pares en una nueva lista llamada evenNumbers.
//    Imprime la lista original y la lista de números pares.

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        // Llenado del Arraylist con numeros del 1 al 10

        for (int i = 1; i <= 10; i++){
            numbers.add(i);
        }

        // crear nueva lista para almacenar los numeros pares

        List<Integer> evenNumbers = new ArrayList<>();

        // Filtrar los numeros pares y agregarlos a la nueva lista

        for (int number: numbers){
            if (number % 2 == 0){
                evenNumbers.add(number);
            }
        }

        //Imprimir la lista Original

        System.out.println("Lista original: " + numbers);

        // Imprimir la lista de numeros pares

        System.out.println("Nùmeros pares: " + evenNumbers);
    }
}

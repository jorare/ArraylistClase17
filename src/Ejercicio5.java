import java.util.ArrayList;

public class Ejercicio5 {

  //  Objetivo: Convertir un ArrayList en un array nativo de Java.
  //    Instrucciones:
  //  Crea un ArrayList de enteros con los valores del 1 al 5.
  //  Convierte este ArrayList en un array de tipo Integer[].
  //  Imprime el contenido del array usando un bucle for.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        Integer[] numbersArray = new Integer[numbers.size()];
        numbersArray = numbers.toArray(numbersArray);
        System.out.println("imprimo contenido del array:");
        for (int number : numbersArray) {
            System.out.println(number);
        }
    }
}
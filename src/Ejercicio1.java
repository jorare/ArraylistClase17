import java.sql.SQLOutput;
import java.util.ArrayList;

public class Ejercicio1 {
    //Ejercicio 1: Creación y manipulación básica de ArrayList
    //Objetivo: Practicar la creación de un ArrayList, agregar, eliminar y modificar elementos.

    //Instrucciones:

    //Crea un ArrayList de tipo String llamado fruits.
    //Agrega los siguientes elementos: "Apple", "Banana", "Cherry".
    //Imprime el tamaño de la lista y los elementos.
    //        Elimina "Banana" de la lista.
    //        Cambia el valor de "Cherry" por "Orange".
    //        Imprime la lista resultante.

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        fruits.remove("banana");

        fruits.set(fruits.indexOf("cherry"),"Orange");

        System.out.println(fruits);




    }
}
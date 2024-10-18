import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

 //   Objetivo: Comparar dos listas y encontrar elementos comunes.
//            Instrucciones:

//    Crea dos ArrayList de String llamadas list1 y list2.
//   Llena list1 con: "Apple", "Banana", "Cherry", "Date".
//    Llena list2 con: "Banana", "Date", "Elderberry", "Fig".
//    Encuentra los elementos comunes entre las dos listas y guárdalos en una nueva lista llamada commonElements.
//    Imprime los elementos comunes.


    public static void main(String[] args) {

        String nombre1 = "Apple";
        String nombre2 = "Banana";
        String nombre3 = "Cherry";
        String nombre4 = "Date";
        String nombre5 = "Banana";
        String nombre6 = "Date";
        String nombre7 = "Elderberry";
        String nombre8 = "Fig";

        //    Crea dos ArrayList de String llamadas list1 y list2.

        List<String> List1 = new ArrayList<>();
        List<String> List2 = new ArrayList<>();

        //   Llena list1 con: "Apple", "Banana", "Cherry", "Date".

        List1.add(nombre1);
        List1.add(nombre2);
        List1.add(nombre3);
        List1.add(nombre4);

        //    Llena list2 con: "Banana", "Date", "Elderberry", "Fig".

        List2.add(nombre5);
        List2.add(nombre6);
        List2.add(nombre7);
        List2.add(nombre8);

      //  Encuentra los elementos comunes entre las dos listas y guárdalos en una nueva lista llamada commonElements.

        List<String> commonElements = new ArrayList<>();
        for (String a : List1) {
            if (List2.contains(a)) {
                commonElements.add(a);
            }
        }

        //    Imprime los elementos comunes.

        System.out.println(commonElements);

    }

}

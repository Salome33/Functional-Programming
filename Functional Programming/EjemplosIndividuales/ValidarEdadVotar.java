package EjemplosIndividuales;

import java.util.function.Predicate;

public class ValidarEdadVotar {
    public static void main(String[] args) {

        Predicate<Integer> puedeVotar = edad -> edad >= 18;

        int edad1 = 20;
        int edad2 = 15;
        int edad3 = 18;

        System.out.println("Edad " + edad1 + " puede votar: " + puedeVotar.test(edad1));
        System.out.println("Edad " + edad2 + " puede votar: " + puedeVotar.test(edad2));
        System.out.println("Edad " + edad3 + " puede votar: " + puedeVotar.test(edad3));
    }
}
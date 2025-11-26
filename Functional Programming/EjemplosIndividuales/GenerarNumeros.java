package EjemplosIndividuales;

import java.util.function.Supplier;

public class GenerarNumeros {
    public static void main(String[] args) {

        Supplier<Integer> numeroAleatorio = () -> (int)(Math.random() * 100);

        System.out.println("Número aleatorio 1: " + numeroAleatorio.get());
        System.out.println("Número aleatorio 2: " + numeroAleatorio.get());
        System.out.println("Número aleatorio 3: " + numeroAleatorio.get());
        System.out.println("Número aleatorio 4: " + numeroAleatorio.get());
    }
}
package EjemplosIndividuales;

import java.util.function.BiConsumer;

public class RegistrarUsuario {
    public static void main(String[] args) {

        BiConsumer<String, String> registrarUsuario = (nombre, email) ->
                System.out.println("Usuario registrado - Nombre: " + nombre + ", Email: " + email);

        registrarUsuario.accept("Ana", "ana@email.com");
        registrarUsuario.accept("Carlos", "carlos@email.com");
        registrarUsuario.accept("María", "maria@email.com");
    }
}
package EjercicioTarea;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class ProgramaPersonas {
    public static void main(String[] args) {
        // Crear lista de personas
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 22, "Bogotá"));
        personas.add(new Persona("María", 17, "Medellín"));
        personas.add(new Persona("Carlos", 30, "Bogotá"));
        personas.add(new Persona("Ana", 25, "Cali"));
        personas.add(new Persona("Pedro", 15, "Bogotá"));
        personas.add(new Persona("Laura", 28, "Cartagena"));

        System.out.println("=== LISTA DE PERSONAS ===");
        personas.forEach(System.out::println);

        // 1. Mostrar únicamente los nombres de todas las personas
        System.out.println("\n=== 1. NOMBRES DE TODAS LAS PERSONAS ===");
        Consumer<Persona> mostrarNombre = persona -> System.out.println(persona.getNombre());
        personas.forEach(mostrarNombre);

        // 2. Filtrar e imprimir las personas mayores de edad
        System.out.println("\n=== 2. PERSONAS MAYORES DE EDAD (18+) ===");
        Predicate<Persona> esMayorDeEdad = persona -> persona.getEdad() >= 18;
        personas.stream()
                .filter(esMayorDeEdad)
                .forEach(System.out::println);

        // 3. Obtener una lista que contenga solo los nombres
        System.out.println("\n=== 3. LISTA SOLO CON NOMBRES ===");
        Function<Persona, String> obtenerNombre = Persona::getNombre;
        List<String> nombres = personas.stream()
                .map(obtenerNombre)
                .collect(Collectors.toList());
        System.out.println(nombres);

        // 4. Mostrar mensaje
        System.out.println("\n=== 4. NOMBRE Y CIUDAD ===");
        BiConsumer<String, String> mostrarNombreCiudad = (nombre, ciudad) ->
                System.out.println(nombre + " vive en " + ciudad);
        personas.forEach(p -> mostrarNombreCiudad.accept(p.getNombre(), p.getCiudad()));

        // 5. Mostrar mensaje: "Hola Juan, tienes 22 años"
        System.out.println("\n=== 5. SALUDO CON EDAD ===");
        BiConsumer<String, Integer> mostrarSaludo = (nombre, edad) ->
                System.out.println("Hola " + nombre + ", tienes " + edad + " años");
        personas.forEach(p -> mostrarSaludo.accept(p.getNombre(), p.getEdad()));

        // 6. Generar una persona aleatoria
        System.out.println("\n=== 6. PERSONA ALEATORIA ===");
        Supplier<Persona> generarPersonaAleatoria = () -> {
            String[] nombresAleatorios = {"Diego", "Sofia", "Miguel", "Valentina", "Andrés"};
            String[] ciudadesAleatorias = {"Bogotá", "Medellín", "Cali", "Barranquilla", "Pereira"};

            String nombreAleatorio = nombresAleatorios[(int)(Math.random() * nombresAleatorios.length)];
            int edadAleatoria = (int)(Math.random() * 50) + 15;
            String ciudadAleatoria = ciudadesAleatorias[(int)(Math.random() * ciudadesAleatorias.length)];

            return new Persona(nombreAleatorio, edadAleatoria, ciudadAleatoria);
        };

        Persona personaAleatoria = generarPersonaAleatoria.get();
        System.out.println("Persona generada: " + personaAleatoria);

        // 7. Imprimir nombres en mayúsculas
        System.out.println("\n=== 7. NOMBRES EN MAYÚSCULAS ===");
        Function<Persona, String> nombreEnMayusculas = persona -> persona.getNombre().toUpperCase();
        personas.stream()
                .map(nombreEnMayusculas)
                .forEach(System.out::println);

        // 8. Filtrar personas que vivan en Bogotá
        System.out.println("\n=== 8. PERSONAS QUE VIVEN EN BOGOTÁ ===");
        Predicate<Persona> vivEnBogota = persona -> persona.getCiudad().equals("Bogotá");
        personas.stream()
                .filter(vivEnBogota)
                .forEach(System.out::println);

        // 9. Crear lista de mensajes: "Juan (22 años) es de Bogotá"
        System.out.println("\n=== 9. MENSAJES COMPLETOS ===");
        BiFunction<Persona, String, String> crearMensaje = (persona, formato) ->
                persona.getNombre() + " (" + persona.getEdad() + " años) es de " + persona.getCiudad();

        List<String> mensajes = personas.stream()
                .map(p -> crearMensaje.apply(p, ""))
                .collect(Collectors.toList());
        mensajes.forEach(System.out::println);
    }
}

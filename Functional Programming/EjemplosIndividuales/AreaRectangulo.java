package EjemplosIndividuales;

import java.util.function.BiFunction;

public class AreaRectangulo{
    public static void main(String[] args) {

        BiFunction<Double, Double, Double> calcularArea = (base, altura) -> base * altura;

        double area1 = calcularArea.apply(5.0, 3.0);
        double area2 = calcularArea.apply(10.0, 7.5);
        double area3 = calcularArea.apply(4.2, 6.8);

        System.out.println("Área del rectángulo (5.0 x 3.0): " + area1);
        System.out.println("Área del rectángulo (10.0 x 7.5): " + area2);
        System.out.println("Área del rectángulo (4.2 x 6.8): " + area3);
    }
}
package EjemplosIndividuales;

import java.util.function.Function;

public class ConvertirTemperatura {
    public static void main(String[] args) {

        Function<Double, Double> celsiusAFahrenheit = celsius -> (celsius * 9/5) + 32;

        double temp1 = 0.0;
        double temp2 = 25.0;
        double temp3 = 100.0;

        System.out.println(temp1 + "°C = " + celsiusAFahrenheit.apply(temp1) + "°F");
        System.out.println(temp2 + "°C = " + celsiusAFahrenheit.apply(temp2) + "°F");
        System.out.println(temp3 + "°C = " + celsiusAFahrenheit.apply(temp3) + "°F");
    }
}
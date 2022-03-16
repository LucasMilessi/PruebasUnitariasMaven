package co.com.sofka.app.calculadora;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class CalculadoraBasica {

    private static final Logger logger = LoggerFactory.getLogger(CalculadoraBasica.class);

    public Long sumar(Long number1, Long number2) {
        logger.info("La suma es {} + {}", number1, number2);
        return number1 + number2;
    }

    public Long restar(Long number1, Long number2) {
        logger.info("La resta es {} - {}", number1, number2);
        return number1 - number2;
    }

    public Long multiplicar(Long number1, Long number2) {
        logger.info("La multiplicacion es {} * {}", number1, number2);
        return number1 * number2;
    }

    public Long dividir(Long number1, Long number2) {
        logger.info("La divición es {} / {}", number1, number2);
        if (number2 == 0) {
            throw new IllegalArgumentException("En una divición no se puede dividir entre 0.");
        }
        return number1 / number2;
    }
}

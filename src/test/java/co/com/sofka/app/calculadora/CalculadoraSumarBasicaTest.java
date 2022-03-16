package co.com.sofka.app.calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSumarBasicaTest {

    private final CalculadoraBasica calculadoraBasica = new CalculadoraBasica();

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "1,    1,   2",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })

    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, calculadoraBasica.sumar(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}
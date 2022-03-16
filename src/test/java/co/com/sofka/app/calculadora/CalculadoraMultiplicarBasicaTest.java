package co.com.sofka.app.calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraMultiplicarBasicaTest {

    private final CalculadoraBasica calculadoraBasica = new CalculadoraBasica();

    @DisplayName("Testing several restar")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "9,    1,   9",
            "28,    2,   56",
            "25,  60, 1500",
            "26,  25, 650"
    })

    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, calculadoraBasica.multiplicar(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

}
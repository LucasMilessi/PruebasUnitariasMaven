package co.com.sofka.app.calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraRestarBasicaTest {

    private final CalculadoraBasica calculadoraBasica = new CalculadoraBasica();

    @DisplayName("Testing several restar")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "9,    1,   8",
            "28,    2,   26",
            "49,  51, -2",
            "1,  100, -99"
    })

    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, calculadoraBasica.restar(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}
package co.com.sofka.app.calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDividirBasicaTest {

    private final CalculadoraBasica calculadoraBasica = new CalculadoraBasica();

    @DisplayName("Testing several restar")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            " 10,  2, 5",
            " 16,  2, 8",
            "420,  6, 70",
            "220,  5, 44"
    })

    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, calculadoraBasica.dividir(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}
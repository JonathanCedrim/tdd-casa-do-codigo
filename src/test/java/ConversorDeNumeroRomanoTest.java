import model.ConversorDeNumeroRomano;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConversorDeNumeroRomanoTest {

    private ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
    int numero = 0;

    @Test
    public void deveEntenderSimboloI() {
        numero = romano.converte("I");
        assertEquals(1, numero);
    }

    @Test
    public void deveEntenderSimboloL() {
        numero = romano.converte("V");
        assertEquals(5, numero);
    }

    @Test
    public void deveEntenderQuatroSimbolosXXII() {
        numero = romano.converte("XXII");
        assertEquals(22, numero);
    }

    @Test
    public void deveEntenderNumeroComoIX() {
        numero = romano.converte("IX");
        assertEquals(9, numero);
    }

    @Test
    public void deveEntenderNumerosComplexosXXIV() {
        numero = romano.converte("XXIV");
        assertEquals(24, numero);
    }
}
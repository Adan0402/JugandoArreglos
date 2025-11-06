import com.mycompany.jugandoarreglos.OperacionesArreglos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class pruebasUnitariasArreglos {
    
    private OperacionesArreglos opa;

    @BeforeEach
    public void setUp() {
        opa = new OperacionesArreglos();
    }

    
    @Test
    public void pruebaSuma1() {
        float[] entrada = {10f, 15f, 10f};
        float salidaEsperada = 35f;
        float salidaReal = opa.calcularSuma(entrada);
        assertEquals(salidaEsperada, salidaReal);
    }

    @Test
    public void pruebaSuma2nulo() {
        float[] entrada = null;
        float salidaEsperada = 0f;
        float salidaReal = opa.calcularSuma(entrada);
        assertEquals(salidaEsperada, salidaReal);
    }

    
    @Test
    public void pruebaPromedio() {
        float[] entrada = {10f, 20f, 30f};
        float salidaEsperada = 20f;
        float salidaReal = opa.calcularPromedio(entrada);
        assertEquals(salidaEsperada, salidaReal);
    }

   
    @Test
    public void pruebaContarMayoresQueLimite() {
        float[] entrada = {5f, 12f, 7f, 20f};
        float limite = 10f;
        int salidaEsperada = 2;
        int salidaReal = opa.contarMayoresQueLimite(entrada, limite);
        assertEquals(salidaEsperada, salidaReal);
    }

   
    @Test
    public void pruebaInvertirArreglo() {
        float[] entrada = {2f, 1f, 9f, 6f};
        float[] salidaEsperada = {6f, 9f, 1f, 2f};
        float[] salidaReal = opa.invertirArreglo(entrada);
        assertArrayEquals(salidaEsperada, salidaReal);
}

    
    @Test
    public void pruebaValoresAbsolutos() {
        float[] entrada = {2f, -3f, -4f, 5f};
        float[] salidaEsperada = {2f, 3f, 4f, 5f};
        float[] salidaReal = opa.obtenerValoresAbsolutos(entrada);
        assertArrayEquals(salidaEsperada, salidaReal);
    }
}

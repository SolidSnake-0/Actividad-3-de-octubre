import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void testProductoAdyacenteValoresPositivos() {
        int[] arreglo = {1, 2, 3, 4};
        int resultado = Main.productoAdyacente(arreglo);
        assertEquals(12, resultado, "El producto adyacente más alto debería ser 12.");
    }

    @Test
    void testProductoAdyacenteConValoresNegativos() {
        int[] arreglo = {1, -4, 2, 2, 5, -1};
        int resultado = Main.productoAdyacente(arreglo);
        assertEquals(10, resultado, "El producto adyacente más alto debería ser 10.");
    }

    @Test
    void testProductoAdyacenteConValoresNegativosYPositivos() {
        int[] arreglo = {-1, -2, 3, 4};
        int resultado = Main.productoAdyacente(arreglo);
        assertEquals(12, resultado, "El producto adyacente más alto debería ser 12.");
    }

}


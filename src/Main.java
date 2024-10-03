public class Main {

    public static int productoAdyacente(int[] arreglo) {
        if (arreglo.length < 2) {
            throw new IllegalArgumentException("El arreglo debe contener al menos dos elementos.");
        }

        int mayorProducto = arreglo[0] * arreglo[1];

        for (int i = 1; i < arreglo.length - 1; i++) {
            int productoActual = arreglo[i] * arreglo[i + 1];
            mayorProducto = Math.max(mayorProducto, productoActual);
        }

        return mayorProducto;
    }

    public static void mostrarResultado(int[] arreglo) {
        int resultado = productoAdyacente(arreglo);
        System.out.println("El producto adyacente es: " + resultado);
    }

    public static void main(String[] args) {
        int[] arreglo = {1, -4, 2, 2, 5, -1};

        mostrarResultado(arreglo);
    }
}

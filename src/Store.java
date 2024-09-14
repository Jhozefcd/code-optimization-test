public class Store {
    public static void main(String[] args) {
       final int PRODUCTO_1 = 15;
       final int PRODUCTO_2 = 10;
       final int PRODCUTO_3 = 5;

       final int CANTIDAD_PRODUCTO_1 = 2;
       final int CANTIDAD_PRODUCTO_2 = 3;
       final int CANTIDAD_PRODUCTO_3 = 4;


       
       int[] Precios = {PRODUCTO_1, PRODUCTO_2, PRODCUTO_3};
        int[] Cantidades = {CANTIDAD_PRODUCTO_1, CANTIDAD_PRODUCTO_2, CANTIDAD_PRODUCTO_3};
        int totalVentas = calculateTotalVentas(Precios, Cantidades);
        evaluateSalesPerformance(totalVentas);
    }
     static int calculateTotalVentas(int[] Precios, int[] Cantidades) {
        int total = 0;
        for (int i = 0; i < Precios.length; i++) {
            total += Precios[i] * Cantidades[i];
        }
        return total;
    }
    static void evaluateSalesPerformance(int totalVentas) {
        if (totalVentas > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }

}
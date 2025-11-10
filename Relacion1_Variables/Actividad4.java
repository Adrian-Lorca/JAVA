package Relacion1_Variables;

public class Actividad4 {
    public static void main(String[] args) {
           int x = 10;
        int y = 3;
        double n = 5.5;
        double m = 2.0;

        System.out.println("Valores:");
        System.out.printf("x = %d%n", x);
        System.out.printf("y = %d%n", y);
        System.out.printf("n = %.2f%n", n);
        System.out.printf("m = %.2f%n%n", m);

        System.out.printf("b) Suma X + Y = %d%n", x + y);
        System.out.printf("c) Diferencia X - Y = %d%n", x - y);
        System.out.printf("d) Producto X * Y = %d%n", x * y);
        System.out.printf("e) Cociente X / Y = %d%n", x / y);
        System.out.printf("f) Resto X %% Y = %d%n%n", x % y);

        System.out.printf("g) Suma N + M = %.2f%n", n + m);
        System.out.printf("h) Diferencia N - M = %.2f%n", n - m);
        System.out.printf("i) Producto N * M = %.2f%n", n * m);
        System.out.printf("j) Cociente N / M = %.2f%n", n / m);
        System.out.printf("k) Resto N %% M = %.2f%n%n", n % m);

        System.out.printf("l) Suma X + N = %.2f%n", x + n);
        System.out.printf("m) Cociente Y / M = %.2f%n", y / m);
        System.out.printf("n) Resto Y %% M = %.2f%n%n", y % m);

        System.out.printf("o) Dobles: 2*x = %d, 2*y = %d, 2*n = %.2f, 2*m = %.2f%n", 2 * x, 2 * y, 2 * n, 2 * m);

        double sumaTodas = x + y + n + m;
        double productoTodas = x * y * n * m;
        System.out.printf("p) Suma de todas las variables = %.2f%n", sumaTodas);
        System.out.printf("q) Producto de todas las variables = %.2f%n", productoTodas);
    }
}

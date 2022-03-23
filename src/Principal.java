public class Principal {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.incrementarPuertas();
        System.out.println(coche.numeroPuertas);

        int num1 = 5, num2 = 10, num3 = 15, resultado = 0;
        resultado = suma(num1, num2, num3);
        System.out.println("El resultado de la funcion suma es: " + resultado);
    }
    public static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

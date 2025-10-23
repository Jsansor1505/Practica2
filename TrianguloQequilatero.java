import java.util.Scanner;
import java.util.Scanner;

public class PerimetroTriangulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double lado1, lado2, lado3, perimetro;

        System.out.println("Ingresa la longitud del primer lado:");
        lado1 = entrada.nextDouble();

        System.out.println("Ingresa la longitud del segundo lado:");
        lado2 = entrada.nextDouble();

        System.out.println("Ingresa la longitud del tercer lado:");
        lado3 = entrada.nextDouble();

        perimetro = lado1 + lado2 + lado3;

        System.out.println("El perímetro del triángulo es: " + perimetro);

        entrada.close();
    }
}

public class AreaTrianguloBaseAltura {

    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos la base del triángulo
        System.out.println("Introduce la base del triángulo:");
        double base = scanner.nextDouble();

        // Pedimos la altura del triángulo
        System.out.println("Introduce la altura del triángulo:");
        double altura = scanner.nextDouble();

        // Calculamos el área
        double area = (base * altura) / 2;

        // Imprimimos el resultado
        System.out.println("El área del triángulo es: " + area);

        // Cerramos el objeto Scanner
        scanner.close();
    }
}

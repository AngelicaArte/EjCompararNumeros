import java.util.Scanner;
// importe Scanner, esto es necesario para leer datos desde el teclado.

//Cree la clase CompararNumeros y el método main
public class CompararNumeros {
    public static void main(String[] args) {
//Scanner, esto permite que podamos leer lo que el usuario escribe en la consola.
        Scanner scanner = new Scanner(System.in);
//Aquí pido los números al usuario, guardándolos en una variable int
        System.out.println("Ingresa el primer número entero: ");
        int numero1 = scanner.nextInt();
//Aquí se pide otro número que se va a guardar en otra variable int
        System.out.println("Ingresa el segundo número entero: ");
        int numero2 = scanner.nextInt();
//Aquí aplico las condicionales if, else if, y else.
//Si (if) el numero1 es mayor
        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1);
//o si el (else if) numero2 es mayor
        } else if (numero2 > numero1) {
            System.out.println("El número mayor es: " + numero2);
//de lo contrario(else) O si son iguales
        } else {
            System.out.println("Ambos números son iguales");
        }
//Cierro el scanner
    scanner.close();

    }
}

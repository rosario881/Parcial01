import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Cual es tu nombre?");
        String nombre = entrada.nextLine();
        System.out.println ("Tu nombre es: " + nombre);
        System.out.println("Cual es tu edad?");

        int edad = entrada.nextInt();

        System.out.println("Tu edad es: " + edad);

    }
}

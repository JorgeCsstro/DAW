import java.util.Scanner;

public class Ejercicio1 {

	public static void main (String[] args) {

        int num;

        System.out.println("¿Que númenro quieres multiplicar?");

        Scanner multiplicacion = new Scanner(System.in);

        num = multiplicacion.nextInt();

            int multiplicador;

            for(multiplicador = 1; multiplicador <=10; multiplicador++){
                System.out.println(num + " X " + multiplicador + " = " + num * multiplicador);        
            }

	}
}
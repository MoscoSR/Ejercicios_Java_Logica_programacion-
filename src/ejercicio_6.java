import java.util.*;
public class ejercicio_6 {
    public static void main(String[] args) {
        System.out.println("Ingrese una pareja de numeros");

        int aux;

        for (int i = 1; i < 10; i++ ) {

            System.out.println("Pareja: " + i);

            Scanner input_1 = new Scanner(System.in);
            int num1 = input_1.nextInt();

            Scanner input_2 = new Scanner(System.in);
            int num2 = input_2.nextInt();

            if (num1>num2) {
                aux = num1;
                num1 = num2;
                num2 = aux;
            }
            System.out.println("Pareja en orden asecndente: " + num1 + " - " + num2);
        }
    }
}

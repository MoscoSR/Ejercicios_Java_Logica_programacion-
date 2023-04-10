import java.util.*;
public class ejercicio_3 {


    public static void main(String[] args) {

        int edad;
        String name;

        for (int i = 1; i < 16; i++) {
            Scanner objetcread =  new Scanner(System.in);
            System.out.println("Ingrese su nombre: ");
            name = objetcread.next();

            Scanner age= new Scanner(System.in);
            System.out.println("Ingrese su edad: ");
            edad = age.nextInt();

            if (edad > 18 ) {
                System.out.println("Su nombre es: " + name + " y su edad ed: " + edad+ "." +  " Es mayor de edad");
            }
            else  {
                System.out.println("Su nombre es: " + name +  " y su edad es  "  + edad + "." + " Es menor de edad");
            }
        }
    }
}

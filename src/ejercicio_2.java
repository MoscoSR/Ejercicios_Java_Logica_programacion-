import java.util.*;
public class ejercicio_2 {
    public static void main(String[] args) {

        String name;
        int num_horas, total_bonificaiones, total_deduc;
        double salario_basico,salario_neto, salario_bruto, valor_hora;

        /*Se tienen 10 registros, cada registro contiene el nombre, salario básico hora,
        el número de horas trabajadas, el total de deducciones y el total de bonificaciones.
        Elabore un diagrama que imprima por cada trabajador el nombre, el salario bruto y el salario neto. */

        for (int i = 1; i < 2; i++ ) {
            Scanner input_1 = new Scanner(System.in);
            System.out.println("Registro: #:"+ i + "\nIngrese su nombre");
            name = input_1.next();

            Scanner input_2 = new Scanner(System.in);
            System.out.println("Registro #:" + i + "\nIngrese valor de la hora ");
            valor_hora= input_2.nextDouble();

            Scanner input_3 = new Scanner(System.in);
            System.out.println("Registro#: " + i + "\nIngrese el numero de horas trabajadas");
            num_horas = input_3.nextInt();


            Scanner input_4 = new Scanner(System.in);
            System.out.println("Registro#: " + i + "\nIngrese las deducciones: ");
            total_deduc = input_4.nextInt();

            Scanner input_5 = new Scanner(System.in);
            System.out.println("Registro#: " + i + "\nIngrese total de bonificaiones: ");
            total_bonificaiones = input_5.nextInt();


            //EL SALARIO BRUTO SIEMPRE ES LA MULTPLICACIONE DE NRO DE HORAS * VALOR HORA

            salario_bruto = valor_hora * num_horas;

            salario_neto = (int)(salario_bruto - total_deduc + total_bonificaiones);

            System.out.println("El salario neto de: " + name + " es de: " + salario_neto);


        }

        }
    }


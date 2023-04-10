import java.util.*;
public class ejercicio_7 {
    public static void main(String[] args) {
        //8.


        /*                    8.	En una universidad, cada que se matricula un estudiante se elabora
                                     un registro con el número del carnet,
                                    la cantidad de materias matriculadas y el estrato social al que pertenece,
                                    Elabore un diagrama que imprima por cada estudiante el carnet y el valor de
                                    la matrícula,
                                    teniendo en cuenta que si el número de materias es superior a 5
                                    y el estrato social es igual a 1 se le hace un descuento del 20 %.
                                     Cada materia tiene un valor de $100. 000.oo     */

        int nro_registro, cant_materias, est_social, nro_est_matr;
        double desc, val_matricula;

        Scanner input_1 = new Scanner(System.in);
        System.out.println("Ingrese el nro de estudiantes a matricular");
        nro_est_matr = input_1.nextInt();

        double valor_mat = 100.000;

        for (int i = 1; i < nro_est_matr; i++) {

            System.out.println("Registro #: " + i);

            Scanner input_2 = new Scanner(System.in);
            System.out.println("Ingrese su numero de carnet");
            nro_registro = input_2.nextInt();

            Scanner input_3 = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de materias matriculadas");
            cant_materias = input_3.nextInt();

            Scanner input_ = new Scanner(System.in);
            System.out.println("Ingrese su estrato social");
            est_social= input_.nextInt();


            val_matricula = (int)(cant_materias * valor_mat - 0.20);

            if (cant_materias >=5 && est_social == 1) {
                System.out.println("El carnet es: " + nro_registro + "\n: El valor total de la matricula es: " + val_matricula);

            } else  {
                System.out.println("El valor de la matricula es: " + valor_mat);
            }
        }
    }
}

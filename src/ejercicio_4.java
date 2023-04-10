import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        String name_articulo;
        double price_unidad, valor_total , desc;
        int cant_art_vend= 20;

        for (int i = 1; i < 20; i ++) {
            Scanner input =  new Scanner(System.in);
            System.out.println("Nombre del articulo");
            name_articulo = input.nextLine();

            Scanner input_2 =  new Scanner(System.in);
            System.out.println("Precio  del articulo");
            price_unidad= input.nextDouble();

            valor_total = (int)(price_unidad * cant_art_vend);

            System.out.println("El nombre del articulo es: " + name_articulo + " y el valor total es: " + valor_total);


            if (price_unidad > 50.000) {
                desc =  0.10 * valor_total;
                System.out.println("El descuenton es de: " + desc);
            } else  {
                System.out.println("No se aplica descuento");
            }


        }
    }
}
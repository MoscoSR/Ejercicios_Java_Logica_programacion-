import java.util.Scanner;

public class ejercicio_9 {
    public static void main(String[] args) {
         int nro_registro, nro_pasajeros;
         double price_ticket, total_din_rec, total_pay_conduc;
         String tipo_veh;

         for (int i = 1; i < 3; i++ ) {
             System.out.println("Registro nro: "+ i);

             Scanner input = new Scanner(System.in);
             System.out.println("Digite el nro de placa");
             nro_registro = input.nextInt();

             Scanner  input__ = new Scanner(System.in);
             System.out.println("Ingrese el numero de pasajeros: ");
             nro_pasajeros = input__.nextInt();


             Scanner input_ =new Scanner(System.in);
             System.out.println("Digite el tipo de vehiculo");
             tipo_veh = input_.next();

             switch (tipo_veh) {
                 case "Bus": price_ticket = 400;
                 total_din_rec = nro_pasajeros * price_ticket;
                 total_pay_conduc = (total_din_rec / 0.20);
                     System.out.println("\n: 1 El nro de placa es: " + nro_registro + "\n:2 " +
                             "El dinero recolectado es: " + total_din_rec + "\n:3  El pago del conductor es: " + total_pay_conduc);
                 break;

                 case "Buseta": price_ticket =500;
                    total_din_rec = (nro_pasajeros * price_ticket);
                    total_pay_conduc = (total_din_rec / 0.20);
                    System.out.println("\n: 1 El nro de placa es: " + nro_registro + "\n:2 " +
                         "El dinero recolectado es: " + total_din_rec + "\n:3  El pago del conductor es: " + total_pay_conduc);
                     break;

                 case "Colectivo": price_ticket = 800;
                 total_din_rec = (int)(nro_pasajeros * price_ticket);
                 total_pay_conduc =(int)(total_din_rec/0.20);
                     System.out.println("\n: 1 El nro de placa es: " + nro_registro + "\n:2 " +
                             "El dinero recolectado es: " +   total_din_rec + "\n:3  El pago del conductor es: " + total_pay_conduc);

             }
         }
    }
}

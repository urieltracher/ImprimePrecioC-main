package imprimeprecioc;
import java.util.Scanner;

/**
 *
 * @author tracher
 *
 * Scanner 
 * Este programa calcula e imprime la cantidad de una orden de compra.
 *
 */
import java.util.Scanner;

public class ImprimePrecioC {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        double precio; // precio de compra del artículo
        int cant; // número de artículos comprados
        double total; // precio total de la orden de compra
        
        System.out.print("Precio de compra del artículo: ");
        precio = stdIn.nextDouble();
        System.out.print("Cantidad: ");
        cant = stdIn.nextInt();

        total = precio * cant;

        System.out.println("Total de orden de compra = $" + total);
    }

}



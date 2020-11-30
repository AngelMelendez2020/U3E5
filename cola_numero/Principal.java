package cola_numero;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        MetodosCN cola = new MetodosCN();
        boolean si = true;
        int op, p = 0, lugar = 0;
        String elemto;
        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1.Insertar nombre");
            System.out.println("2.Sacar");
            System.out.println("3.Mostrar");
            System.out.println("4.salir del menu");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    if (p == 0) {
                        System.out.println("Ingrese nombre");
                        elemto = leer.next();
                        lugar = (int) (Math.random() * 10 + 1);
                        cola.ingresar(elemto, lugar);
                        p++;
                    } else {
                        System.out.println("Ingrese nombre");
                        elemto = leer.next();
                        lugar++;
                        cola.ingresar(elemto, lugar);
                    }
                    break;
                case 2:
                        cola.salir();
                    break;
                case 3:
                    cola.mostrar();
                    break;
                case 4:
                    si = false;
                    break;

            }
        } while (si);
    }

}

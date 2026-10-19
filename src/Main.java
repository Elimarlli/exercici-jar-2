import es.iesmz.prueba.Coche;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        Coche coche = new Coche ("Fiat", "Panda", "Groc");

        int menu = 1;

        while (menu > 0 && menu <= 8) {
            System.out.println("\n\n----MENÚ---");
            System.out.println("1 - Imprimir dades del cotxe");
            System.out.println("2 - Pintar el cotxe");
            System.out.println("3 - Establir Marca");
            System.out.println("4 - Establir Model");
            System.out.println("5 - Establir Color");
            System.out.println("6 - Accelerar");
            System.out.println("7 - Frenar");
            System.out.println("8 - Parar el coche");
            System.out.println("9 - Salir");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    coche.imprime();
                    break;
                case 2:
                    coche.pinta();
                    break;
                case 3:
                    System.out.println("Introduce la nueva marca: ");
                    String marca = sc.nextLine();
                    coche.setMarca(marca);
                    break;
                case 4:
                    System.out.println("Introduce el nuevo modelo: ");
                    String modelo = sc.nextLine();
                    coche.setModelo(modelo);
                    break;
                case 5:
                    System.out.print("Introduce el nuevo color: ");
                    String color = sc.nextLine();
                    coche.setColor(color);
                    break;
                case 6:
                    System.out.print("Introduce la velocidad de aceleración: ");
                    int acelerar = sc.nextInt();
                    coche.acelera(acelerar);
                    break;
                case 7:
                    System.out.print("Introduce la velocidad de frenado: ");
                    int frenar = sc.nextInt();
                    coche.frena(frenar);
                    break;
                case 8:
                    System.out.print("Coche parado.");
                    coche.para();
                    break;
            }
        }



    }


}
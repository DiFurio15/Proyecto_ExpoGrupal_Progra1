package Zamorano;

import java.util.ArrayList;
import java.util.Scanner;

public class Ganado {

    private ArrayList<String> ganado = new ArrayList<>();
    private Scanner puchamon = new Scanner(System.in);

    public void agregarAnimales() {
        System.out.println("Ingresa el nombre del Animal que quieres agregar a tu ganado bien agronomo zamorano:");
        String Animal = puchamon.nextLine();
        if (ganado.size() < 6) {
            ganado.add(Animal);
            System.out.println(Animal + " ha sido agregado a tu ganado! (como en el pueblo)");
        } else {
            System.out.println("Tu establo ya alcanzo su capacidad maxima. Debes vender un animal para poder meter a otro.");
        }
    }

    public void verGanado() {
        System.out.println("Tu ganado actual es: " + ganado);
    }

    public void VenderGanado() {
        System.out.println("Ingresa el nombre del animal que quiere vender");
        String mumu = puchamon.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < ganado.size(); i++) {
            if (ganado.get(i).equalsIgnoreCase(mumu)) {
                ganado.remove(i);
                System.out.println(mumu + " ha salido de su Pokebola!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el Pokemon " + mumu + " en tu equipo.");
        }
    }

    public void menu() {
        boolean salir = false;
        while (!salir) {
            System.out.println("1. Agregar animal");
            System.out.println("2. Ver ganado bien zamorano");
            System.out.println("3. Vender animal");
            System.out.println("4. Salir");
            System.out.println("Elige una opción:");
            int opcion = puchamon.nextInt();
            puchamon.nextLine(); 
            switch (opcion) {
                case 1:
                    agregarAnimales();
                    break;
                case 2:
                    verGanado();
                    break;
                case 3:
                    VenderGanado();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Porfa elige una opcion entre el 1 al 4.");
            }
        }
    }
}


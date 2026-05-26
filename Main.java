import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        SistemaVehiculos sistema = new SistemaVehiculos();

        int opcion;

        do{

        System.out.println("=== Sistema de registro de vehiculos ===");

        System.out.println("1.Registrar vehiculo");
        System.out.println("2.Mostrar vehiculos");
        System.out.println("3.Buscar vehiculo por placa");
        System.out.println("4.Mostrar vehiculos por marca");
        System.out.println("5.Salir");

        System.out.println("Seleccione una opcion: ");
        opcion = scan.nextInt();

        scan.nextLine();

        switch(opcion){
            case 1:
                sistema.registrarVehiculo();
                break;

            case 2:
                sistema.mostrarVehiculos();
                break;

            case 3:
                sistema.buscarPorPlaca();;
                break;
            
            case 4:
                sistema.mostrarPorMarca();
                break;

            case 5:
                System.out.println("\n funcion en construccion");
                break;

            default:
                System.out.println("\nOpcion no valida");
            }
        }while(opcion != 5);

        scan.close();
    }
}
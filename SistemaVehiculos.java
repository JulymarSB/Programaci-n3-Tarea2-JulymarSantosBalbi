import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaVehiculos {
    private ArrayList<Vehiculo> vehiculos;

    private Scanner scan;

    public SistemaVehiculos(){
        vehiculos = new ArrayList<>();

        scan = new Scanner(System.in);
    }

    public void registrarVehiculo(){
        String placa;
        String marca;
        String modelo;
        int year;
        String color;
        double precio;

        System.out.println("=== Registrar Vehiculo ===");

        System.out.println("Placa: ");
        placa = scan.nextLine();

        for(int i = 0; i < vehiculos.size(); i++){
            if(vehiculos.get().getPlaca.equalsIgnoreCase(placa)){
                System.out.println("Ya existe un vehiculo con esa placa");

                return;
            }
        }

        System.out.println("Marca: ");
        marca = scan.nextLine();

        System.out.println("Modelo: ");
        modelo = scan.nextLine();

        System.out.println("Year: ");
        year = scan.nextInt();

        scan.nextLine();

        System.out.println("Color: ");
        color = scan.nextLine();

        System.out.println("Precio: ");
        precio = scan.nextDouble();

        scan.nextLine();

        Vehiculo vehiculo = new Vehiculo(placa, marca, modelo, year, color, precio);

        vehiculos.add(vehiculo);

        System.out.println("Vehiculo registrado");
    }

    public void mostrarVehiculos(){
        if(vehiculos.isEmpty()){
            System.out.println("\nNo hay vehiculos registrados");

            return;
        }

        System.out.println("=== Lista de vehiculos ===");

        for(int i = 0; i < vehiculos.size(); i++){

            vehiculos.get(i).mostrarInformaciom();
        }
    }

    public void buscarPorPlaca(){

        if(vehiculos.isEmpty()){
            System.out.println("\nNo hay vehiculos registrados");

            return;
        }
        String placaBuscar;

        System.out.println("=== Buscar vehiculo");

        System.out.println("Ingrese la placa: ");
        placaBuscar = scan.nextLine();

        for(int i = 0; i < vehiculos.size(); i++){
            Vehiculo vehiculo = vehiculos.get(i);

            if(vehiculo.getPlaca().equalsIgnoreCase(placaBuscar)){
                vehiculo.mostrarInformaciom();

                return;
            }
        }
        System.out.println("No se encontro el vehiculo con esa placa");
    }

    public void mostrarPorMarca(){
        if(vehiculos.isEmpty()){
            System.out.println("\nNo hay vehiculos registrados");

            return;
        }

        String marcaBuscar;

        System.out.println("=== Buscar vehiculo por marca ===");

        System.out.println("Ingrese la marca: ");
        marcaBuscar = scan.nextLine();

        for(int i = 0; i < vehiculos.size(); i ++){
            Vehiculo vehiculo = vehiculos.get(i);

            if(vehiculo.getMarca().equalsIgnoreCase(marcaBuscar)){
                vehiculo.mostrarInformaciom();

            
            }
        }
        System.out.println("No se encontraron vehiculos de esa marca");
    }
    
}

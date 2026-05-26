public class Vehiculo {
    
    private String placa;
    private String marca;
    private String modelo;
    private int year;
    private String color;
    private double precio;

    public Vehiculo(String placa, String marca, String modelo, int year, String color, double precio){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.precio = precio;
    }

    public String getPlaca(){
        return placa;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getYear(){
        return year;
    }

    public String getColor(){
        return color;
    }

    public double getPrecio(){
        return precio;
    }

    public void mostrarInformaciom(){

        System.out.println("=== Vehiculo ===");
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Precio: $" + precio);
    }
}

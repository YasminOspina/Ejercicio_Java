import domain.Administrador;
import domain.Cliente;
import domain.GestorDeViajes;
import external.Proveedor;
import external.Viaje;

public class Program {

    public static void main(String[] args){
        Administrador admin = new Administrador(2, "Ana", "García", "1985-05-15", "Avenida 45", "555-5678");

        GestorDeViajes gestor = new GestorDeViajes(3, "Carlos", "López", "1992-08-23", "Carrera 67", "555-9876");

        Proveedor proveedor1 = new Proveedor(1, "Airbnb");
        Proveedor proveedor2 = new Proveedor(2, "Booking");

        Cliente cliente = new Cliente(1, "Juan", "Pérez", "1990-01-01", "Calle 123", "555-1234");
        cliente.agregarDestino("París");
        cliente.agregarDestino("Tokio");

        Viaje viaje1 = new Viaje(1, "Nueva York");
        Viaje viaje2 = new Viaje(2, "Londres");

        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido() + ", Destinos: " + cliente.getDestinos());
        System.out.println("Administrador: " + admin.getNombre() + " " + admin.getApellido() + ", Rol: " + admin.getRol());
        System.out.println("Gestor de Viajes: " + gestor.getNombre() + " " + gestor.getApellido() + ", Rol: " + gestor.getRol());
        System.out.println("Viaje 1: " + viaje1.getNombreCiudad());
        System.out.println("Viaje 2: " + viaje2.getNombreCiudad());
        System.out.println("Proveedor 1: " + proveedor1.getNombrePlataforma());
        System.out.println("Proveedor 2: " + proveedor2.getNombrePlataforma());
    }
}

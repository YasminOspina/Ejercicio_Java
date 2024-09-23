package domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GestorDeViajes extends Usuario {
    private String rol;

    public GestorDeViajes(int id, String nombre, String apellido, String fechaNacimiento, String direccion, String telefono) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.rol = "Gestor de Viajes";
    }
}
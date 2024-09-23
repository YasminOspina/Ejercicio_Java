package domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Administrador extends Usuario {
    private String rol;

    public Administrador(int id, String nombre, String apellido, String fechaNacimiento, String direccion, String telefono) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.rol = "Administrador";
    }
}
package domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private final String fechaNacimiento;
    private String direccion;
    private String telefono;

    // Constructor parametrizado
    public Usuario(int id, String nombre, String apellido, String fechaNacimiento, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Usuario(){
        //Constructor vacío por el punto 4
       this.fechaNacimiento = "05/05/2000";
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
}
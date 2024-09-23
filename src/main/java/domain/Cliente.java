package domain;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Cliente extends Usuario {
    private List<String> destinos;

    public Cliente(int id, String nombre, String apellido, String fechaNacimiento, String direccion, String telefono) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.destinos = new ArrayList<>();
    }

    public void agregarDestino(String destino) {
        destinos.add(destino);
    }
}
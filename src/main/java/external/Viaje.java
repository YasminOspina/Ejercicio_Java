package external;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Viaje {
    private int id;
    private String nombreCiudad;

    public Viaje(int id, String nombreCiudad) {
        this.id = id;
        this.nombreCiudad = nombreCiudad;
    }
}
package external;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Proveedor {
    private int id;
    private String nombrePlataforma;

    public Proveedor(int id, String nombrePlataforma) {
        this.id = id;
        this.nombrePlataforma = nombrePlataforma;
    }
}
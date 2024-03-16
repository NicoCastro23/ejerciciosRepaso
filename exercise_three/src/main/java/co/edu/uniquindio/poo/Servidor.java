package co.edu.uniquindio.poo;

import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Data
@Getter
public class Servidor {
    private String cantidadCPU;
    private String cantidadRAM;
    private String tipoRed;
}

package co.edu.uniquindio.poo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Data
@Getter
@Setter

public class Editor {
    private Documento documento;
    private Usuario usuario;
}

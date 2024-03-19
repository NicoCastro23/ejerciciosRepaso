package co.edu.uniquindio.poo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Data
@Getter
@Setter

public class Usuario {
    private String name;
    private String lastName;
    private String id;
}

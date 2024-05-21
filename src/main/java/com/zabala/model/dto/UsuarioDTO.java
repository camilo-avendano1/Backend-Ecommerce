package com.zabala.model.dto;
import lombok.*;

@Data
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private Integer id;
    private String nombre;
    private String cedula;
    private String correo;
    private String contrasena;
    private String jsonCarrito;

    @NonNull
    private String rol;
}
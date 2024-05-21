package com.zabala.model.mapper;

import com.zabala.model.dto.UsuarioDTO;
import com.zabala.model.entity.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "cedula", source = "cedula")
    @Mapping(target = "correo", source = "correo")
    @Mapping(target = "contrasena", source = "contrasena")
    @Mapping(target = "rol", source = "rol")
    @Mapping(target = "jsonCarrito", source = "jsonCarrito")
    Usuario toUsuario(UsuarioDTO usuarioDTO);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "cedula", source = "cedula")
    @Mapping(target = "correo", source = "correo")
    @Mapping(target = "contrasena", source = "contrasena")
    @Mapping(target = "rol", source = "rol")
    @Mapping(target = "jsonCarrito", source = "jsonCarrito")
    UsuarioDTO toUsuarioDTO(Usuario usuario);

    List<UsuarioDTO> toUsuariosDTOList(List<Usuario> usuarios);

    List<Usuario> toUsuariosList(List<UsuarioDTO> usuariosDTO);


}
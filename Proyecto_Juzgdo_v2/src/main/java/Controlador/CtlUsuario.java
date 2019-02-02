/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;

/**
 *
 * @author Daryl
 */
public class CtlUsuario {

    public boolean iniciarSesion(String nombreUsuario, String contrasenia) {
        Usuario usuario = (Usuario) Main.dao.buscar(nombreUsuario, Usuario.class);
        return usuario.getContrasena().equals(contrasenia);
    }
    
}

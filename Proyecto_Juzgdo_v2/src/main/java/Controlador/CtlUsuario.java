/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONObject;

/**
 *
 * @author Daryl
 */
public class CtlUsuario {

    public boolean iniciarSesion(String nombreUsuario, String contrasenia) {
        try {
            Usuario usuario = (Usuario) Main.dao.buscar(nombreUsuario, Usuario.class);
            return usuario.getContrasena().equals(contrasenia);
        } catch (NullPointerException e) {
            return false;
        }
    }
    
    public boolean registrar(String nombreUsuario, String contrasena, String nombreCompleto, String tipoUsuario){
        Usuario usuario = new Usuario(nombreUsuario, contrasena, nombreCompleto, tipoUsuario);
        JSONObject joRespuesta = Main.dao.guardar(usuario);
        System.out.println("[Registrado] : { nombreUsuario: " + ((JSONObject) joRespuesta.get("Registro")).get("nombreUsuario")+" }");
        return (Boolean) (joRespuesta).get("Resultado");
    }

    public DefaultTableModel listar() {
        ArrayList<Usuario> lstUsuarios = new ArrayList<>(Main.dao.cargar("Usuario"));
        String[] lista = {"Nombre de usuario", "Nombre Completo", "Tipo de Usuario"};
        DefaultTableModel modelo = new DefaultTableModel(new Object[][]{}, lista);
        lstUsuarios.forEach((usuario) -> {
            modelo.addRow(new Object[]{
                usuario.getNombreUsuario(),
                usuario.getNombreCompleto(),
                usuario.getTipoUsuario()
            });
        });
        return modelo;
    }
    
    public Usuario busrcar(String nombreUsuario){
        return (Usuario) Main.dao.buscar(nombreUsuario, Usuario.class);
    }
    
    public boolean modificar(String nombreUsuario, String contrasena, String nombreCompleto, String tipoUsuario){
        Usuario usuario = new Usuario(nombreUsuario, contrasena, nombreCompleto, tipoUsuario);
        JSONObject joRespuesta = Main.dao.modificar(usuario);
        System.out.println("[Registrado] : { nombreUsuario: " + ((JSONObject) joRespuesta.get("Registro")).get("nombreUsuario")+" }");
        return (Boolean) (joRespuesta).get("Resultado");
    }

}

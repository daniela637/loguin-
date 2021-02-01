
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuario2 implements Serializable {
  
    @Id
    @GeneratedValue  (strategy = GenerationType.SEQUENCE)  //PARA QUE SE GENERE RL ID AUTOMATICAMENTE EN LA BD  
    private int idUsu;
    @Basic
    private String nombre;
    private String apellido;
    private String usuario  ;  
    private String contrasenia;

    public Usuario2() {
    }

    public Usuario2(int idUsu, String nombre, String apellido, String usuario, String contrasenia) {
        this.idUsu = idUsu;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

   
    
    
    
}


package Persistencia;

import Logica.Usuario2;


public class ControladoraPersistencia {
    
    
    
    UsuarioJpaController usuJPA = new UsuarioJpaController();
    
    
    public void crearUusario (Usuario2 usu){
        usuJPA.create(usu);
    }
}

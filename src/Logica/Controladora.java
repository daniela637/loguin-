
package Logica;

import Persistencia.ControladoraPersistencia;


public class Controladora {
   
    ControladoraPersistencia persi = new ControladoraPersistencia ();
    
    
public void crearUsuario (Usuario2 usu){
        persi.crearUusario(usu);
    }
}

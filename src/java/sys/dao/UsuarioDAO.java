
package sys.dao;

import sys.modelo.Usuario;


public interface UsuarioDAO {
    
    //Busqueda de usuario
    public Usuario search(Usuario usuario);
    
    
    //Inicia sesion
    public Usuario login (Usuario usuario);
    
}

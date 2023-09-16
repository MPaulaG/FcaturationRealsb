package sys.bean;

import javax.inject.Named;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.primefaces.PrimeFaces;
import sys.dao.UsuarioDAO;
import sys.impl.UsuarioDAOImpl;
import sys.modelo.Usuario;

@ManagedBean
@Named(value = "loginBean")
@SessionScoped

public class LoginBean implements Serializable {

    private Usuario usuario;
    private String nombreUsuario;
    private String password;

    public LoginBean() {
        this.usuario = new Usuario();
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void login() {
        FacesMessage message = null; //envia mensajes emergentes
        boolean loggedIn = false;
        String ruta = "";

        UsuarioDAO datos = new UsuarioDAOImpl();
        this.usuario = datos.login(usuario);

        if (usuario != null) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", this.usuario.getNombreUsuario());
            loggedIn = true;
            ruta = "/FcaturationRealsb/faces/views/Bienvenido.xhtml";
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", this.usuario.getNombreUsuario());
        } else {
            loggedIn = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error de acceso", "Usuario o password incorrectos");
            usuario = new Usuario();
        }

        FacesContext.getCurrentInstance().addMessage(null, message);//toma todas las faces por las que pasa una pagina, y muestra la fase que contiene cada pagina
        PrimeFaces.current().ajax().addCallbackParam("loggedIn", loggedIn);//manda cualquier parametro a la vista. lso gestiona dentro de un java script
        PrimeFaces.current().ajax().addCallbackParam("ruta", ruta);
    }

    public String logout() {
        this.nombreUsuario = null;
        this.password = null;

        HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        httpSession.invalidate();//Borra la sesion
        return "/Login";

    }
}

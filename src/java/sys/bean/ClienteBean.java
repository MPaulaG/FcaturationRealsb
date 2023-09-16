package sys.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;

import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import sys.dao.ClienteDAO;
import sys.impl.ClienteDAOImpl;
import sys.modelo.Cliente;

@ManagedBean //controlador
@Named(value = "clienteBean")//indica el alias de la aplicacion trabaja directamente en la vista
@ViewScoped //la informacion se gestiona en la pagina al salir la despacha

public class ClienteBean {

    private Cliente cliente = null;
    private List<Cliente> clientes = null;

    public ClienteBean() {
    }

    //Los getters y setters ayudan a trabajar desde la vista
    //Establecer las acciones sobre la vista
    //Aplicamos polimorfismo a travez de un objeto de la interfaz clienteDAO
    public List<Cliente> getClientes() {
        ClienteDAO datos = new ClienteDAOImpl();
        this.clientes = datos.select();
        return clientes;
    }

    public void prepareCliente() {
        this.cliente = new Cliente();
    }

    public void insertCliente() {
        ClienteDAO datos = new ClienteDAOImpl();
        datos.insert(cliente);
    }

    public void updateCliente() {
        ClienteDAO datos = new ClienteDAOImpl();
        datos.update(cliente);
        this.cliente = new Cliente();
    }

    public void deleteCliente() {
        ClienteDAO datos = new ClienteDAOImpl();
        datos.delete(cliente);
        this.cliente = new Cliente();

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

}

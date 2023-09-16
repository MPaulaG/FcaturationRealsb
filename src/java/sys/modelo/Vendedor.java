package sys.modelo;
// Generated 12/09/2023 19:48:16 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Vendedor generated by hbm2java
 */
public class Vendedor  implements java.io.Serializable {


     private Integer codVendedor;
     private String nombres;
     private String apellidos;
     private String dui;
     private String celular;
     private String direccion;
     private Set<Factura> facturas = new HashSet<Factura>(0);
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Vendedor() {
    }

	
    public Vendedor(String nombres, String apellidos, String dui, String celular, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dui = dui;
        this.celular = celular;
        this.direccion = direccion;
    }
    public Vendedor(String nombres, String apellidos, String dui, String celular, String direccion, Set<Factura> facturas, Set<Usuario> usuarios) {
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.dui = dui;
       this.celular = celular;
       this.direccion = direccion;
       this.facturas = facturas;
       this.usuarios = usuarios;
    }
   
    public Integer getCodVendedor() {
        return this.codVendedor;
    }
    
    public void setCodVendedor(Integer codVendedor) {
        this.codVendedor = codVendedor;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDui() {
        return this.dui;
    }
    
    public void setDui(String dui) {
        this.dui = dui;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Set<Factura> getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set<Factura> facturas) {
        this.facturas = facturas;
    }
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}



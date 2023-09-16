package sys.modelo;
// Generated 12/09/2023 19:48:16 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private Integer codProducto;
     private String nombreProducto;
     private BigDecimal precioVenta;
     private int stockMinimo;
     private int stockActual;
     private String codBarra;
     private Set<Detallefactura> detallefacturas = new HashSet<Detallefactura>(0);

    public Producto() {
    }

	
    public Producto(String nombreProducto, BigDecimal precioVenta, int stockMinimo, int stockActual, String codBarra) {
        this.nombreProducto = nombreProducto;
        this.precioVenta = precioVenta;
        this.stockMinimo = stockMinimo;
        this.stockActual = stockActual;
        this.codBarra = codBarra;
    }
    public Producto(String nombreProducto, BigDecimal precioVenta, int stockMinimo, int stockActual, String codBarra, Set<Detallefactura> detallefacturas) {
       this.nombreProducto = nombreProducto;
       this.precioVenta = precioVenta;
       this.stockMinimo = stockMinimo;
       this.stockActual = stockActual;
       this.codBarra = codBarra;
       this.detallefacturas = detallefacturas;
    }
   
    public Integer getCodProducto() {
        return this.codProducto;
    }
    
    public void setCodProducto(Integer codProducto) {
        this.codProducto = codProducto;
    }
    public String getNombreProducto() {
        return this.nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public BigDecimal getPrecioVenta() {
        return this.precioVenta;
    }
    
    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }
    public int getStockMinimo() {
        return this.stockMinimo;
    }
    
    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }
    public int getStockActual() {
        return this.stockActual;
    }
    
    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }
    public String getCodBarra() {
        return this.codBarra;
    }
    
    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }
    public Set<Detallefactura> getDetallefacturas() {
        return this.detallefacturas;
    }
    
    public void setDetallefacturas(Set<Detallefactura> detallefacturas) {
        this.detallefacturas = detallefacturas;
    }




}



package sys.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import sys.dao.ProductosDAO;
import sys.impl.ProductosDAOImpl;
import sys.modelo.Producto;

@ManagedBean
@Named(value = "productosBean")
@ViewScoped
public class ProductosBean {

    private Producto producto = null;
    private List<Producto> productos = null;

    public List<Producto> getProductos() {
        ProductosDAO datos = new ProductosDAOImpl();
        productos = datos.select();

        return productos;
    }

    public void prepareProductos() {
        producto = new Producto();
    }

    public void insertProducto() {
        ProductosDAO datos = new ProductosDAOImpl();
        datos.insert(producto);
    }

    public void updateProducto() {
        ProductosDAO datos = new ProductosDAOImpl();
        datos.update(producto);
        producto = new Producto();
    }

    public void deleteProducto() {
        ProductosDAO datos = new ProductosDAOImpl();
        datos.delete(producto);
        producto = new Producto();

    }

    public ProductosBean() {
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

}

package mainPack;
import java.util.List;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Almacen")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = { "producto","cliente","pedido" })
public class Almacen implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List <Producto> producto;
	private List <Cliente> cliente;
	private List <Pedido> pedido;
	
	
	@XmlElementWrapper(name="productos")
	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	
	@XmlElementWrapper(name="clientes")
	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
	
	@XmlElementWrapper(name="pedidos")
	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

}

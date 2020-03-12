package mainPack;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Producto")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = { "codigo","nombre", "descripcion","stock", "localizacion", "pendiente" })
public class Producto implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private String nombre, descripcion, codigo, stock,pendiente;
	private Localizacion localizacion;
	

	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(String nombre, String descripcion, String codigo, String stock, Localizacion localizacion, String pendiente) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.stock = stock;
		this.localizacion = localizacion;
		this.pendiente = pendiente;
	}
	@XmlElement(name= "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@XmlElement(name= "descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@XmlElement(name= "codigo")
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@XmlElement(name= "stock")
	public String getStock() {
		return stock;
	}
	
	public void setStock(String stock) {
		this.stock = stock;
	}

	@XmlElement(name= "pendiente")
	public String getPendiente() {
		return pendiente;
	}

	public void setPendiente(String pendiente) {
		this.pendiente = pendiente;
	}
	
	@XmlElement(name= "localizacion")
	public Localizacion getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}

}

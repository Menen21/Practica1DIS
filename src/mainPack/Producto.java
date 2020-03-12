package mainPack;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Producto")
public class Producto {
	
	private String nombre, descripcion, codigo, stock, pasillo, estanteria, estante,pendiente;
	

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", stock=" + stock + ", pasillo=" + pasillo + ", estanteria=" + estanteria
				+ ", estante=" + estante + ", pendiente=" + pendiente + ", nombre=" + nombre + ", descripcion="
				+ descripcion + "]";
	}
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(String nombre, String descripcion, String codigo, String stock, String pasillo, String estanteria,
			String estante, String pendiente) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.stock = stock;
		this.pasillo = pasillo;
		this.estanteria = estanteria;
		this.estante = estante;
		this.pendiente = pendiente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getPasillo() {
		return pasillo;
	}

	public void setPasillo(String pasillo) {
		this.pasillo = pasillo;
	}

	public String getEstanteria() {
		return estanteria;
	}

	public void setEstanteria(String estanteria) {
		this.estanteria = estanteria;
	}

	public String getEstante() {
		return estante;
	}

	public void setEstante(String estante) {
		this.estante = estante;
	}

	public String getPendiente() {
		return pendiente;
	}

	public void setPendiente(String pendiente) {
		this.pendiente = pendiente;
	}


	
	

}

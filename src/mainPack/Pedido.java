package mainPack;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Pedido")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = { "producto", "cantidad", "destinatario", "direccion", "fechaestimada" })
public class Pedido implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String producto,  destinatario, cantidad, fechaestimada;
	private Direccion direccion;
	
	
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pedido(String producto, String destinatario, String cantidad, String fechaestimada, Direccion direccion) {
		super();
		this.producto = producto;
		this.destinatario = destinatario;
		this.cantidad = cantidad;
		this.fechaestimada = fechaestimada;
		this.direccion = direccion;
	}


	@XmlElement(name= "producto")
	public String getProducto() {
		return producto;
	}



	public void setProducto(String producto) {
		this.producto = producto;
	}



	@XmlElement(name= "destinatario")
	public String getDestinatario() {
		return destinatario;
	}



	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}



	@XmlElement(name= "cantidad")
	public String getCantidad() {
		return cantidad;
	}



	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}



	@XmlElement(name= "fecha_entrega_estimada")
	public String getFechaestimada() {
		return fechaestimada;
	}



	public void setFechaestimada(String fechaestimada) {
		this.fechaestimada = fechaestimada;
	}


	@XmlElement(name= "direccion")
	public Direccion getDireccion() {
		return direccion;
	}



	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	
	
}

package mainPack;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Pedido")
public class Pedido {
	
	private String producto, calle, poblacion, pais, destinatario, cantidad, fechaestimada, numcalle, codpostal;
	
	@Override
	public String toString() {
		return "Pedido [producto=" + producto + ", calle=" + calle + ", poblacion=" + poblacion + ", pais=" + pais
				+ ", destinatario=" + destinatario + ", cantidad=" + cantidad + ", fechaestimada=" + fechaestimada
				+ ", numcalle=" + numcalle + ", codpostal=" + codpostal + "]";
	}

	
	
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Pedido(String producto, String calle, String poblacion, String pais, String destinatario, String cantidad,
			String fechaestimada, String numcalle, String codpostal) {
		super();
		this.producto = producto;
		this.calle = calle;
		this.poblacion = poblacion;
		this.pais = pais;
		this.destinatario = destinatario;
		this.cantidad = cantidad;
		this.fechaestimada = fechaestimada;
		this.numcalle = numcalle;
		this.codpostal = codpostal;
	}



	public String getProducto() {
		return producto;
	}



	public void setProducto(String producto) {
		this.producto = producto;
	}



	public String getCalle() {
		return calle;
	}



	public void setCalle(String calle) {
		this.calle = calle;
	}



	public String getPoblacion() {
		return poblacion;
	}



	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}



	public String getPais() {
		return pais;
	}



	public void setPais(String pais) {
		this.pais = pais;
	}



	public String getDestinatario() {
		return destinatario;
	}



	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}



	public String getCantidad() {
		return cantidad;
	}



	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}



	public String getFechaestimada() {
		return fechaestimada;
	}



	public void setFechaestimada(String fechaestimada) {
		this.fechaestimada = fechaestimada;
	}



	public String getNumcalle() {
		return numcalle;
	}



	public void setNumcalle(String numcalle) {
		this.numcalle = numcalle;
	}



	public String getCodpostal() {
		return codpostal;
	}



	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}


	
	
}

package mainPack;

public class Pedido {
	
	private String producto, calle, poblacion, pais, destinatario;
	private int cantidad, fechaestimada, numcalle, codpostal;
	
	public Pedido(String producto, int cantidad, String calle, int numcalle, int codpostal, String poblacion, String pais, String destinatario,
			int fechaestimada) {
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

	@Override
	public String toString() {
		return "Pedido [producto=" + producto + ", calle=" + calle + ", poblacion=" + poblacion + ", pais=" + pais
				+ ", destinatario=" + destinatario + ", cantidad=" + cantidad + ", fechaestimada=" + fechaestimada
				+ ", numcalle=" + numcalle + ", codpostal=" + codpostal + "]";
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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getFechaestimada() {
		return fechaestimada;
	}

	public void setFechaestimada(int fechaestimada) {
		this.fechaestimada = fechaestimada;
	}

	public int getNumcalle() {
		return numcalle;
	}

	public void setNumcalle(int numcalle) {
		this.numcalle = numcalle;
	}

	public int getCodpostal() {
		return codpostal;
	}

	public void setCodpostal(int codpostal) {
		this.codpostal = codpostal;
	}
	
	
	
}

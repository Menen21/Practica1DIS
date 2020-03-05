package mainPack;

public class Pedido {
	
	private Producto producto;
	private Cliente destinatario;
	private int cantidad;
	private String fecha;
	
	
	@Override
	public String toString() {
		return "Pedido [producto=" + producto + ", destinatario=" + destinatario + ", cantidad=" + cantidad + ", fecha="
				+ fecha + "]";
	}


	public Pedido(Producto producto, Cliente destinatario, int cantidad, String fecha) {
		super();
		this.producto = producto;
		this.destinatario = destinatario;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public Cliente getDestinatario() {
		return destinatario;
	}


	public void setDestinatario(Cliente destinatario) {
		this.destinatario = destinatario;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	

}

package mainPack;

public class Producto {
	
	private int codigo, stock, pasillo, estanteria, estante,pendiente;
	private String nombre, descripcion;
	
	
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", stock=" + stock + ", pasillo=" + pasillo + ", estanteria=" + estanteria
				+ ", estante=" + estante + ", pendiente=" + pendiente + ", nombre=" + nombre + ", descripcion="
				+ descripcion + "]";
	}

	public Producto(int codigo, int stock, int pasillo, int estanteria, int estante, int pendiente, String nombre,
			String descripcion) {
		super();
		this.codigo = codigo;
		this.stock = stock;
		this.pasillo = pasillo;
		this.estanteria = estanteria;
		this.estante = estante;
		this.pendiente = pendiente;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPasillo() {
		return pasillo;
	}

	public void setPasillo(int pasillo) {
		this.pasillo = pasillo;
	}

	public int getEstanteria() {
		return estanteria;
	}

	public void setEstanteria(int estanteria) {
		this.estanteria = estanteria;
	}

	public int getEstante() {
		return estante;
	}

	public void setEstante(int estante) {
		this.estante = estante;
	}

	public int getPendiente() {
		return pendiente;
	}

	public void setPendiente(int pendiente) {
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
	
	

}

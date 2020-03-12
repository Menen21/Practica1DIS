package mainPack;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Cliente")
public class Cliente {
	private String nombre, apellidos, email, calle, poblacion, pais,numcalle, codpostal, telf;
	
	
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", calle=" + calle
				+ ", poblacion=" + poblacion + ", pais=" + pais + ", telf=" + telf + ", numcalle=" + numcalle
				+ ", codpostal=" + codpostal + "]";
	}

	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cliente(String nombre, String apellidos, String email, String calle, String poblacion, String pais, String telf, String numcalle, String codpostal) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.calle = calle;
		this.poblacion = poblacion;
		this.pais = pais;
		this.telf = telf;
		this.numcalle = numcalle;
		this.codpostal = codpostal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
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
